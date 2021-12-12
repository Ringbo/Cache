diff --git a/src/com/owncloud/android/operations/OAuth2GetAccessToken.java b/src/com/owncloud/android/operations/OAuth2GetAccessToken.java
index fbbe254..b64ebce 100644
--- a/src/com/owncloud/android/operations/OAuth2GetAccessToken.java
+++ b/src/com/owncloud/android/operations/OAuth2GetAccessToken.java
@@ -62,7 +62,7 @@
             }
             
             if (result == null) { 
-                NameValuePair[] nameValuePairs = new NameValuePair[5];
+                NameValuePair[] nameValuePairs = new NameValuePair[4];
                 nameValuePairs[0] = new NameValuePair(OAuth2Constants.KEY_GRANT_TYPE, mGrantType);
                 nameValuePairs[1] = new NameValuePair(OAuth2Constants.KEY_CODE, mOAuth2ParsedAuthorizationResponse.get(OAuth2Constants.KEY_CODE));            
                 nameValuePairs[2] = new NameValuePair(OAuth2Constants.KEY_REDIRECT_URI, mRedirectUri);       
