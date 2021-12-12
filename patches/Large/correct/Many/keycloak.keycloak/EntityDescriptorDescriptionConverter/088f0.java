diff --git a/services/src/main/java/org/keycloak/protocol/saml/EntityDescriptorDescriptionConverter.java b/services/src/main/java/org/keycloak/protocol/saml/EntityDescriptorDescriptionConverter.java
index cca12cb..3d62a27 100755
--- a/services/src/main/java/org/keycloak/protocol/saml/EntityDescriptorDescriptionConverter.java
+++ b/services/src/main/java/org/keycloak/protocol/saml/EntityDescriptorDescriptionConverter.java
@@ -111,7 +111,7 @@
         String logoutPost = getLogoutLocation(spDescriptorType, JBossSAMLURIConstants.SAML_HTTP_POST_BINDING.get());
         if (logoutPost != null) attributes.put(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_POST_ATTRIBUTE, logoutPost);
         String logoutRedirect = getLogoutLocation(spDescriptorType, JBossSAMLURIConstants.SAML_HTTP_REDIRECT_BINDING.get());
-        if (logoutPost != null) attributes.put(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_REDIRECT_ATTRIBUTE, logoutRedirect);
+        if (logoutRedirect != null) attributes.put(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_REDIRECT_ATTRIBUTE, logoutRedirect);
 
         String assertionConsumerServicePostBinding = CoreConfigUtil.getServiceURL(spDescriptorType, JBossSAMLURIConstants.SAML_HTTP_POST_BINDING.get());
         if (assertionConsumerServicePostBinding != null) {
