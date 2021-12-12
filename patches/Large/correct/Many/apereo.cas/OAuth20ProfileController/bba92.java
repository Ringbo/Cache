diff --git a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20ProfileController.java b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20ProfileController.java
index f099f8d..dc01a50 100644
--- a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20ProfileController.java
+++ b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20ProfileController.java
@@ -74,7 +74,7 @@
         String accessToken = request.getParameter(OAuthConstants.ACCESS_TOKEN);
         if (StringUtils.isBlank(accessToken)) {
             // try getting the bearer token from the authorization header
-            String authHeader = request.getHeader("Authorization");
+            final String authHeader = request.getHeader("Authorization");
             if (authHeader != null && authHeader.startsWith("bearer ")) {
                 accessToken = authHeader.substring(7);
             }
