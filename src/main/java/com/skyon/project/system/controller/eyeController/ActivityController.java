package com.skyon.project.system.controller.eyeController;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class ActivityController {

    protected final Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private RepositoryService repositoryService;

    @PostConstruct
    public void initActivitiWF() {

        DeploymentBuilder deployment = repositoryService.createDeployment();
        deployment.name("天眼工作流部署");
        // 加载文件
        DeploymentBuilder myProcess_1 = deployment.addClasspathResource("processes/EyeWorkFlow.bpmn");
        // 完成部署
        Deployment deploy = myProcess_1.deploy();

        logger.info("部署id::{}",deploy.getId());
    }
}
