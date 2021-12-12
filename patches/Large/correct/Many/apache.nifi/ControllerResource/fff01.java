diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ControllerResource.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ControllerResource.java
index 8f33ba6..9d08e22 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ControllerResource.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ControllerResource.java
@@ -283,7 +283,7 @@
                 lookup -> {
                     authorizeController(RequestAction.WRITE);
 
-                    final ConfigurableComponentAuthorizable authorizable = lookup.getProcessorByType(requestReportingTask.getType());
+                    final ConfigurableComponentAuthorizable authorizable = lookup.getReportingTaskByType(requestReportingTask.getType());
                     if (authorizable.isRestricted()) {
                         lookup.getRestrictedComponents().authorize(authorizer, RequestAction.WRITE, NiFiUserUtils.getNiFiUser());
                     }
@@ -380,7 +380,7 @@
                 lookup -> {
                     authorizeController(RequestAction.WRITE);
 
-                    final ConfigurableComponentAuthorizable authorizable = lookup.getProcessorByType(requestControllerService.getType());
+                    final ConfigurableComponentAuthorizable authorizable = lookup.getControllerServiceByType(requestControllerService.getType());
                     if (authorizable.isRestricted()) {
                         lookup.getRestrictedComponents().authorize(authorizer, RequestAction.WRITE, NiFiUserUtils.getNiFiUser());
                     }
