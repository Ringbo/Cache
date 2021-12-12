diff --git a/src/main/java/org/scribe/model/OAuthRequest.java b/src/main/java/org/scribe/model/OAuthRequest.java
index a712ae9..ec7f023 100644
--- a/src/main/java/org/scribe/model/OAuthRequest.java
+++ b/src/main/java/org/scribe/model/OAuthRequest.java
@@ -41,7 +41,7 @@
 
   private String checkKey(String key)
   {
-    if (!key.startsWith(OAUTH_PREFIX) || key.equals(OAuthConstants.SCOPE))
+    if (!key.startsWith(OAUTH_PREFIX) || !key.equals(OAuthConstants.SCOPE))
     {
       throw new IllegalArgumentException(String.format("OAuth parameters must either be %s or start with '%s'", OAuthConstants.SCOPE, OAUTH_PREFIX));
     } else
