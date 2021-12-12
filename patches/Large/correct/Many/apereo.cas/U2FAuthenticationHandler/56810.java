diff --git a/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/U2FAuthenticationHandler.java b/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/U2FAuthenticationHandler.java
index 65aa29c..9bef11d 100644
--- a/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/U2FAuthenticationHandler.java
+++ b/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/U2FAuthenticationHandler.java
@@ -51,7 +51,7 @@
         DeviceRegistration registration = null;
         try {
             registration = u2f.finishSignature(authenticateRequest, authenticateResponse, u2FDeviceRepository.getRegisteredDevices(p.getId()));
-            return createHandlerResult(tokenCredential, p, null);
+            return createHandlerResult(tokenCredential, p);
         } catch (final DeviceCompromisedException e) {
             registration = e.getDeviceRegistration();
             throw new PreventedException("Device possibly compromised and therefore blocked: " + e.getMessage(), e);
