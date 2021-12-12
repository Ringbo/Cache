diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentProcessor.java b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentProcessor.java
index 2857523..acdf8b6 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentProcessor.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentProcessor.java
@@ -400,7 +400,7 @@
     private static ServiceName installSessionManagerFactory(ServiceTarget target, ServiceName deploymentServiceName, String deploymentName, Module module, JBossWebMetaData metaData, ServletContainerService servletContainerService) {
 
         Integer maxActiveSessions = metaData.getMaxActiveSessions();
-        if(maxActiveSessions == null) {
+        if(maxActiveSessions == null && servletContainerService != null) {
             maxActiveSessions = servletContainerService.getMaxSessions();
         }
         ServiceName name = deploymentServiceName.append("session");
