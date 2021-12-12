diff --git a/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/view/Cas30ResponseView.java b/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/view/Cas30ResponseView.java
index ea352e5..636e7dd 100644
--- a/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/view/Cas30ResponseView.java
+++ b/support/cas-server-support-validation/src/main/java/org/apereo/cas/web/view/Cas30ResponseView.java
@@ -86,7 +86,7 @@
 
         if (!registeredService.getAttributeReleasePolicy().isAuthorizedToReleaseAuthenticationAttributes()) {
             LOGGER.debug("Attribute release policy for service [{}] is configured to never release any attributes", registeredService);
-            return new LinkedHashMap<>();
+            return new LinkedHashMap<>(0);
         }
         
         final Map<String, Object> filteredAuthenticationAttributes = new HashMap<>(getAuthenticationAttributes(model));
