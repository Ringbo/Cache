diff --git a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/authenticator/OAuth20ClientAuthenticator.java b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/authenticator/OAuth20ClientAuthenticator.java
index 1174596..c536498 100644
--- a/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/authenticator/OAuth20ClientAuthenticator.java
+++ b/support/cas-server-support-oauth/src/main/java/org/apereo/cas/support/oauth/authenticator/OAuth20ClientAuthenticator.java
@@ -66,7 +66,7 @@
     protected void validateCredentials(final UsernamePasswordCredentials credentials,
                                        final OAuthRegisteredService registeredService,
                                        final WebContext context) {
-        if (!OAuth20Utils.checkClientSecret(registeredService, credentials.getUsername())) {
+        if (!OAuth20Utils.checkClientSecret(registeredService, credentials.getPassword())) {
             throw new CredentialsException("Bad secret for client identifier: " + credentials.getPassword());
         }
     }
