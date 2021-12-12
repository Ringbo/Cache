diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
index 1155c27..e95db6c 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
@@ -762,9 +762,9 @@
             }
 
             if (mergedMetaData.getDefaultEncoding()!=null){
-                deploymentInfo.setDefaultEncoding(mergedMetaData.getDefaultEncoding());
+                d.setDefaultEncoding(mergedMetaData.getDefaultEncoding());
             }else if (servletContainer.getDefaultEncoding()!=null){
-                deploymentInfo.setDefaultEncoding(servletContainer.getDefaultEncoding());
+                d.setDefaultEncoding(servletContainer.getDefaultEncoding());
             }
 
             return d;
