diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/filters/OAuthRequestFilter.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/filters/OAuthRequestFilter.java
index 5fb6108..e8478ad 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/filters/OAuthRequestFilter.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/filters/OAuthRequestFilter.java
@@ -106,7 +106,7 @@
         String validAudience = validateAudiences(accessTokenV.getAudiences());
         
         // Check if token was issued by the supported issuer
-        if (issuer != null && issuer.equals(accessTokenV.getTokenIssuer())) {
+        if (issuer != null && !issuer.equals(accessTokenV.getTokenIssuer())) {
             AuthorizationUtils.throwAuthorizationFailure(supportedSchemes, realm);
         }
         // Find the scopes which match the current request
