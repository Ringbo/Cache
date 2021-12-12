diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/ImplicitGrantService.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/ImplicitGrantService.java
index 4ae8c68..b90be5a 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/ImplicitGrantService.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/services/ImplicitGrantService.java
@@ -56,7 +56,7 @@
                                    UserSubject userSubject,
                                    ServerAccessToken preAuthorizedToken) {
         ServerAccessToken token = null;
-        if (preAuthorizedToken != null) {
+        if (preAuthorizedToken == null) {
             AccessTokenRegistration reg = new AccessTokenRegistration();
             reg.setClient(client);
             reg.setGrantType(OAuthConstants.IMPLICIT_GRANT);
