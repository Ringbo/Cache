diff --git a/host-controller/src/main/java/org/jboss/as/domain/controller/operations/deployment/ServerGroupDeploymentReplaceHandler.java b/host-controller/src/main/java/org/jboss/as/domain/controller/operations/deployment/ServerGroupDeploymentReplaceHandler.java
index 3e9eed6..9658ed3 100644
--- a/host-controller/src/main/java/org/jboss/as/domain/controller/operations/deployment/ServerGroupDeploymentReplaceHandler.java
+++ b/host-controller/src/main/java/org/jboss/as/domain/controller/operations/deployment/ServerGroupDeploymentReplaceHandler.java
@@ -70,7 +70,7 @@
 
     @Override
     public ModelNode getModelDescription(Locale locale) {
-        return DeploymentDescription.getDeployDeploymentOperation(locale);
+        return DeploymentDescription.getReplaceDeploymentOperation(locale);
     }
 
     public void execute(OperationContext context, ModelNode operation) throws OperationFailedException {
