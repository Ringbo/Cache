diff --git a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
index 915c3fc..e0e5a5a 100644
--- a/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
+++ b/undertow/src/main/java/org/wildfly/extension/undertow/deployment/UndertowDeploymentInfoService.java
@@ -499,7 +499,7 @@
                     if(file.startsWith("/")) {
                         d.addWelcomePages(file.substring(1));
                     } else {
-                        d.addWelcomePages(welcomeFiles);
+                        d.addWelcomePages(file);
                     }
                 }
             } else {
