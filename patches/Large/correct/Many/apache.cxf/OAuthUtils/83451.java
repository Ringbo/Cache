diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
index 1857bf3..a7f9dc6 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
@@ -200,7 +200,7 @@
                                             List<String> allowedAudiences) {
         return StringUtils.isEmpty(providedAudiences) 
                && StringUtils.isEmpty(allowedAudiences)
-               || allowedAudiences.contains(providedAudiences);
+               || allowedAudiences.containsAll(providedAudiences);
     }
     
     public static boolean checkRequestURI(String servletPath, String uri) {
