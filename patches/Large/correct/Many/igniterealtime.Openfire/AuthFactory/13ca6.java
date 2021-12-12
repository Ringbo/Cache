diff --git a/xmppserver/src/main/java/org/jivesoftware/openfire/auth/AuthFactory.java b/xmppserver/src/main/java/org/jivesoftware/openfire/auth/AuthFactory.java
index 39801b2..17e1e32 100644
--- a/xmppserver/src/main/java/org/jivesoftware/openfire/auth/AuthFactory.java
+++ b/xmppserver/src/main/java/org/jivesoftware/openfire/auth/AuthFactory.java
@@ -322,9 +322,9 @@
     public static AuthToken checkOneTimeAccessToken(String userToken) throws UnauthorizedException {
         String accessToken = JiveGlobals.getXMLProperty(ONE_TIME_PROPERTY);
         if (isOneTimeAccessTokenEnabled() && accessToken.equals(userToken)) {
-            // Remove the one time token but left the property.
-            // This invocation will overwrite the openfire.xml with the empty OneTimeAccessToken tag.
-            JiveGlobals.setXMLProperty(ONE_TIME_PROPERTY, "");
+            // Remove the one time token.
+            // This invocation will overwrite the openfire.xml with removing the OneTimeAccessToken tag.
+            JiveGlobals.deleteXMLProperty(ONE_TIME_PROPERTY);
             Log.info("Login with the one time access token.");
             return AuthToken.generateOneTimeToken(accessToken);
         } else {
