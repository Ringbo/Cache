diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/DeploymentDefinition.java b/undertow/src/main/java/org/wildfly/extension/undertow/DeploymentDefinition.java
index 9c20840..b3681eb 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/DeploymentDefinition.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/DeploymentDefinition.java
@@ -98,7 +98,7 @@
             final String server = SERVER.resolveModelAttribute(context, subModel).asString();
 
             final ServiceController<?> controller = context.getServiceRegistry(false).getService(UndertowService.deploymentServiceName(server, host, path));
-            if (controller.getState() != ServiceController.State.UP){//check if deployment is active at all
+            if (controller != null && controller.getState() != ServiceController.State.UP){//check if deployment is active at all
                 return;
             }
 
