diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
index eb338ff..2f97280 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
@@ -118,7 +118,7 @@
         String redirectUri = validateRedirectUri(client, params.getFirst(OAuthConstants.REDIRECT_URI)); 
         
         // Enforce the client confidentiality requirements
-        if (!OAuthUtils.isGrantSupportedForClient(client, !canSupportPublicClient(client), supportedGrantType)) {
+        if (!OAuthUtils.isGrantSupportedForClient(client, canSupportPublicClient(client), supportedGrantType)) {
             return createErrorResponse(params, redirectUri, OAuthConstants.UNAUTHORIZED_CLIENT);
         }
         
