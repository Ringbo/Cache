diff --git a/application/src/test/java/org/thingsboard/server/controller/UserControllerTest.java b/application/src/test/java/org/thingsboard/server/controller/UserControllerTest.java
index 4fafd61..d57871b 100644
--- a/application/src/test/java/org/thingsboard/server/controller/UserControllerTest.java
+++ b/application/src/test/java/org/thingsboard/server/controller/UserControllerTest.java
@@ -70,7 +70,7 @@
         
         logout();
         doGet("/api/noauth/activate?activateToken={activateToken}", TestMailService.currentActivateToken)
-        .andExpect(status().isPermanentRedirect())
+        .andExpect(status().isSeeOther())
         .andExpect(header().string(HttpHeaders.LOCATION, "/login/createPassword?activateToken=" + TestMailService.currentActivateToken));
 
         JsonNode tokenInfo = readResponse(doPost("/api/noauth/activate", "activateToken", TestMailService.currentActivateToken, "password", "testPassword").andExpect(status().isOk()), JsonNode.class);
@@ -120,7 +120,7 @@
         doPost("/api/noauth/resetPasswordByEmail", "email", email)
         .andExpect(status().isOk());
         doGet("/api/noauth/resetPassword?resetToken={resetToken}", TestMailService.currentResetPasswordToken)
-        .andExpect(status().isPermanentRedirect())
+        .andExpect(status().isSeeOther())
         .andExpect(header().string(HttpHeaders.LOCATION, "/login/resetPassword?resetToken=" + TestMailService.currentResetPasswordToken));
         
         JsonNode tokenInfo = readResponse(doPost("/api/noauth/resetPassword", "resetToken", TestMailService.currentResetPasswordToken, "password", "testPassword2").andExpect(status().isOk()), JsonNode.class);
