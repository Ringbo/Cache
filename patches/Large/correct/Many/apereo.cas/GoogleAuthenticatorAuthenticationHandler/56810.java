diff --git a/support/cas-server-support-gauth-core/src/main/java/org/apereo/cas/adaptors/gauth/GoogleAuthenticatorAuthenticationHandler.java b/support/cas-server-support-gauth-core/src/main/java/org/apereo/cas/adaptors/gauth/GoogleAuthenticatorAuthenticationHandler.java
index 289e77b..5d27f58 100644
--- a/support/cas-server-support-gauth-core/src/main/java/org/apereo/cas/adaptors/gauth/GoogleAuthenticatorAuthenticationHandler.java
+++ b/support/cas-server-support-gauth-core/src/main/java/org/apereo/cas/adaptors/gauth/GoogleAuthenticatorAuthenticationHandler.java
@@ -85,7 +85,7 @@
 
         if (isCodeValid) {
             this.tokenRepository.store(new GoogleAuthenticatorToken(otp, uid));
-            return createHandlerResult(tokenCredential, this.principalFactory.createPrincipal(uid), null);
+            return createHandlerResult(tokenCredential, this.principalFactory.createPrincipal(uid));
         }
 
         throw new FailedLoginException("Failed to authenticate code " + otp);
