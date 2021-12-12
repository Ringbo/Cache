diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
index 65a01fa..5e8ed8a 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/OAuthUtils.java
@@ -182,12 +182,12 @@
     }
     
     public static long getIssuedAt() {
-        return System.currentTimeMillis() / 1000;
+        return System.currentTimeMillis() / 1000L;
     }
     
     public static boolean isExpired(Long issuedAt, Long lifetime) {
         return lifetime != 0L
-            && issuedAt + lifetime < System.currentTimeMillis() / 1000;
+            && issuedAt + lifetime < System.currentTimeMillis() / 1000L;
     }
     
     public static boolean validateAudience(String audience, List<String> audiences) {
