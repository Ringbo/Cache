diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ProcessGroupResource.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ProcessGroupResource.java
index dbe12db..17c65cf 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ProcessGroupResource.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/ProcessGroupResource.java
@@ -2135,7 +2135,7 @@
                     final Authorizable processGroup = lookup.getProcessGroup(groupId).getAuthorizable();
                     processGroup.authorize(authorizer, RequestAction.WRITE, user);
 
-                    final ConfigurableComponentAuthorizable authorizable = lookup.getProcessorByType(requestControllerService.getType());
+                    final ConfigurableComponentAuthorizable authorizable = lookup.getControllerServiceByType(requestControllerService.getType());
                     if (authorizable.isRestricted()) {
                         lookup.getRestrictedComponents().authorize(authorizer, RequestAction.WRITE, user);
                     }
