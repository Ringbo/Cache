diff --git a/application/src/test/java/org/thingsboard/server/controller/AbstractControllerTest.java b/application/src/test/java/org/thingsboard/server/controller/AbstractControllerTest.java
index 435f9a6..b85f159 100644
--- a/application/src/test/java/org/thingsboard/server/controller/AbstractControllerTest.java
+++ b/application/src/test/java/org/thingsboard/server/controller/AbstractControllerTest.java
@@ -200,7 +200,7 @@
         User savedUser = doPost("/api/user", user, User.class);
         logout();
         doGet("/api/noauth/activate?activateToken={activateToken}", TestMailService.currentActivateToken)
-        .andExpect(status().isPermanentRedirect())
+        .andExpect(status().isSeeOther())
         .andExpect(header().string(HttpHeaders.LOCATION, "/login/createPassword?activateToken=" + TestMailService.currentActivateToken));
         JsonNode tokenInfo = readResponse(doPost("/api/noauth/activate", "activateToken", TestMailService.currentActivateToken, "password", password).andExpect(status().isOk()), JsonNode.class);
         validateAndSetJwtToken(tokenInfo, user.getEmail());
