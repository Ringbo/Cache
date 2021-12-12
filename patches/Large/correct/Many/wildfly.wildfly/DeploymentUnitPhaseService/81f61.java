diff --git a/server/src/main/java/org/jboss/as/server/deployment/DeploymentUnitPhaseService.java b/server/src/main/java/org/jboss/as/server/deployment/DeploymentUnitPhaseService.java
index d9cedb6..565e003 100644
--- a/server/src/main/java/org/jboss/as/server/deployment/DeploymentUnitPhaseService.java
+++ b/server/src/main/java/org/jboss/as/server/deployment/DeploymentUnitPhaseService.java
@@ -134,7 +134,7 @@
                 }
             }
             if (deploymentUnit.getParent() != null) {
-                phaseServiceBuilder.addDependencies(Services.deploymentUnitName(deploymentUnit.getParent().getName(), deploymentUnit.getName(), nextPhase));
+                phaseServiceBuilder.addDependencies(Services.deploymentUnitName(deploymentUnit.getParent().getName(), nextPhase));
             }
             List<DeploymentUnit> subDeployments = deploymentUnit.getAttachmentList(Attachments.SUB_DEPLOYMENTS);
             // make sure all sub deployments have finished this phase before moving to the next one
