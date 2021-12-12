diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
index 51ea97e..667de92 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/RedirectionBasedGrantService.java
@@ -271,7 +271,7 @@
             sessionTokenParamName = OAuthConstants.SESSION_AUTHENTICITY_TOKEN;
         }
         String sessionToken = params.getFirst(sessionTokenParamName);
-        if (!compareRequestAndSessionTokens(sessionToken, params, userSubject)) {
+        if (sessionToken == null || !compareRequestAndSessionTokens(sessionToken, params, userSubject)) {
             throw ExceptionUtils.toBadRequestException(null, null);     
         }
         
