diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/OAuthClientUtils.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/OAuthClientUtils.java
index 9d19af9..e00ce0b 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/OAuthClientUtils.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/client/OAuthClientUtils.java
@@ -409,11 +409,11 @@
         throws OAuthServiceException {
         // this should all be handled by token specific serializers
         String tokenType = token.getTokenType().toLowerCase();
-        if (OAuthConstants.BEARER_TOKEN_TYPE.equals(tokenType)) {
+        if (OAuthConstants.BEARER_TOKEN_TYPE.equalsIgnoreCase(tokenType)) {
             sb.append(OAuthConstants.BEARER_AUTHORIZATION_SCHEME);
             sb.append(" ");
             sb.append(token.getTokenKey());
-        } else if (OAuthConstants.HAWK_TOKEN_TYPE.equals(tokenType)) {
+        } else if (OAuthConstants.HAWK_TOKEN_TYPE.equalsIgnoreCase(tokenType)) {
             if (httpProps == null) {
                 throw new IllegalArgumentException("MAC scheme requires HTTP Request properties");
             }
