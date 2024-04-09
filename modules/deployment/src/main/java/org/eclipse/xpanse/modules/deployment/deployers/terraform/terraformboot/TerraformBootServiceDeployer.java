/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.exceptions.TerraformBootRequestFailedException;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.api.TerraformFromGitRepoApi;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.api.TerraformFromScriptsApi;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.model.TerraformAsyncDeployFromGitRepoRequest;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.model.TerraformAsyncDeployFromScriptsRequest;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.model.TerraformAsyncDestroyFromScriptsRequest;
import org.eclipse.xpanse.modules.orchestrator.deployment.DeployResult;
import org.eclipse.xpanse.modules.orchestrator.deployment.DeployTask;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

/**
 * Bean to manage service deployment via terraform-boot.
 */
@Slf4j
@Component
@Profile("terraform-boot")
public class TerraformBootServiceDeployer {

    private final TerraformFromScriptsApi terraformFromScriptsApi;
    private final TerraformFromGitRepoApi terraformFromGitRepoApi;
    private final TerraformBootHelper terraformBootHelper;

    /**
     * Constructor for TerraformBootServiceDeployer bean.
     */
    public TerraformBootServiceDeployer(TerraformFromScriptsApi terraformFromScriptsApi,
                                        TerraformFromGitRepoApi terraformFromGitRepoApi,
                                        TerraformBootHelper terraformBootHelper) {
        this.terraformFromScriptsApi = terraformFromScriptsApi;
        this.terraformFromGitRepoApi = terraformFromGitRepoApi;
        this.terraformBootHelper = terraformBootHelper;
    }

    /**
     * method to perform service deployment using scripts provided in OCL.
     */
    public DeployResult deployFromScripts(DeployTask deployTask) {
        DeployResult result = new DeployResult();
        TerraformAsyncDeployFromScriptsRequest request = getDeployFromScriptsRequest(deployTask);
        try {
            terraformFromScriptsApi.asyncDeployWithScripts(request, deployTask.getId());
            result.setId(deployTask.getId());
            return result;
        } catch (RestClientException e) {
            log.error("terraform-boot deploy service failed. service id: {} , error:{} ",
                    deployTask.getId(), e.getMessage());
            throw new TerraformBootRequestFailedException(e.getMessage());
        }
    }

    /**
     * method to perform service deployment using scripts form GIT repo.
     */
    public DeployResult deployFromGitRepo(DeployTask deployTask) {
        DeployResult result = new DeployResult();
        TerraformAsyncDeployFromGitRepoRequest request = getDeployFromGitRepoRequest(deployTask);
        try {
            terraformFromGitRepoApi.asyncDeployFromGitRepo(request, deployTask.getId());
            result.setId(deployTask.getId());
            return result;
        } catch (RestClientException e) {
            log.error("terraform-boot deploy service failed. service id: {} , error:{} ",
                    deployTask.getId(), e.getMessage());
            throw new TerraformBootRequestFailedException(e.getMessage());
        }
    }

    private TerraformAsyncDeployFromScriptsRequest getDeployFromScriptsRequest(DeployTask task) {
        TerraformAsyncDeployFromScriptsRequest request =
                new TerraformAsyncDeployFromScriptsRequest();
        request.setIsPlanOnly(false);
        request.setScripts(terraformBootHelper.getFiles(task));
        request.setVariables(terraformBootHelper.getInputVariables(task, true));
        request.setEnvVariables(terraformBootHelper.getEnvironmentVariables(task));
        request.setWebhookConfig(terraformBootHelper.getWebhookConfig(task, false));
        request.setDeploymentScenario(
                TerraformAsyncDeployFromScriptsRequest.DeploymentScenarioEnum.fromValue(
                        task.getDeploymentScenario().toValue()));
        return request;
    }

    private TerraformAsyncDeployFromGitRepoRequest getDeployFromGitRepoRequest(DeployTask task) {
        TerraformAsyncDeployFromGitRepoRequest request =
                new TerraformAsyncDeployFromGitRepoRequest();
        request.setIsPlanOnly(false);
        request.setVariables(terraformBootHelper.getInputVariables(task, true));
        request.setEnvVariables(terraformBootHelper.getEnvironmentVariables(task));
        request.setWebhookConfig(terraformBootHelper.getWebhookConfig(task, false));
        request.setGitRepoDetails(
                terraformBootHelper.convertTerraformScriptGitRepoDetailsFromDeployFromGitRepo(
                        task.getOcl().getDeployment().getScriptsRepo())
        );
        request.setDeploymentScenario(
                TerraformAsyncDeployFromGitRepoRequest.DeploymentScenarioEnum.fromValue(
                        task.getDeploymentScenario().toValue()));
        return request;
    }
}
