package com.redhat.example;

import org.jbpm.services.api.DeploymentEvent;
import org.jbpm.services.api.DeploymentEventListener;

public class TestDeploymentListener implements DeploymentEventListener {

    @Override
    public void onDeploy(DeploymentEvent event) {
        onEvent(event);
    }

    @Override
    public void onUnDeploy(DeploymentEvent event) {
        onEvent(event);
    }

    @Override
    public void onActivate(DeploymentEvent event) {
        onEvent(event);
    }

    @Override
    public void onDeactivate(DeploymentEvent event) {
        onEvent(event);
    }

    private void onEvent(DeploymentEvent event) {
        System.out.println("TestDeploymentListener.onEvent() " + event.getDeploymentId());
    }
}
