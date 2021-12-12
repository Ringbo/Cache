diff --git a/support/cas-server-support-yubikey-core/src/main/java/org/apereo/cas/adaptors/yubikey/YubiKeyAuthenticationHandler.java b/support/cas-server-support-yubikey-core/src/main/java/org/apereo/cas/adaptors/yubikey/YubiKeyAuthenticationHandler.java
index 713846a..c83db72 100644
--- a/support/cas-server-support-yubikey-core/src/main/java/org/apereo/cas/adaptors/yubikey/YubiKeyAuthenticationHandler.java
+++ b/support/cas-server-support-yubikey-core/src/main/java/org/apereo/cas/adaptors/yubikey/YubiKeyAuthenticationHandler.java
@@ -94,7 +94,7 @@
             final ResponseStatus status = response.getStatus();
             if (status.compareTo(ResponseStatus.OK) == 0) {
                 LOGGER.debug("YubiKey response status [{}] at [{}]", status, response.getTimestamp());
-                return createHandlerResult(yubiKeyCredential, this.principalFactory.createPrincipal(uid), null);
+                return createHandlerResult(yubiKeyCredential, this.principalFactory.createPrincipal(uid));
             }
             throw new FailedLoginException("Authentication failed with status: " + status);
         } catch (final YubicoVerificationException | YubicoValidationFailure e) {
