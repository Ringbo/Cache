diff --git a/server/src/main/java/org/jboss/as/server/deployment/integration/SeamProcessor.java b/server/src/main/java/org/jboss/as/server/deployment/integration/SeamProcessor.java
index 4baa0ac..2c13036 100644
--- a/server/src/main/java/org/jboss/as/server/deployment/integration/SeamProcessor.java
+++ b/server/src/main/java/org/jboss/as/server/deployment/integration/SeamProcessor.java
@@ -134,7 +134,7 @@
 
     public void deploy(DeploymentPhaseContext phaseContext) throws DeploymentUnitProcessingException {
         DeploymentUnit deploymentUnit = phaseContext.getDeploymentUnit();
-        if (deploymentUnit.getParent() == null) {
+        if (deploymentUnit.getParent() != null) {
             return;
         }
 
