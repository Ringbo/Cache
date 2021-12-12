diff --git a/support/cas-server-support-azure/src/main/java/org/apereo/cas/adaptors/azure/AzureAuthenticatorAuthenticationHandler.java b/support/cas-server-support-azure/src/main/java/org/apereo/cas/adaptors/azure/AzureAuthenticatorAuthenticationHandler.java
index 6ffb772..1c3e322 100644
--- a/support/cas-server-support-azure/src/main/java/org/apereo/cas/adaptors/azure/AzureAuthenticatorAuthenticationHandler.java
+++ b/support/cas-server-support-azure/src/main/java/org/apereo/cas/adaptors/azure/AzureAuthenticatorAuthenticationHandler.java
@@ -53,7 +53,7 @@
             final PFAuthResult r = azureAuthenticatorInstance.authenticate(params);
 
             if (r.getAuthenticated()) {
-                return createHandlerResult(c, principalFactory.createPrincipal(principal.getId()), null);
+                return createHandlerResult(c, principalFactory.createPrincipal(principal.getId()));
             }
             LOGGER.error("Authentication failed. Call status: [{}]-[{}]. Error: [{}]", r.getCallStatus(),
                     r.getCallStatusString(), r.getMessageError());
