diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/AbstractOAuthDataProvider.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/AbstractOAuthDataProvider.java
index ac5ce0f..7dcac57 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/AbstractOAuthDataProvider.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/AbstractOAuthDataProvider.java
@@ -208,7 +208,7 @@
         if (recycleRefreshTokens) {
             createNewRefreshToken(at);
         } else {
-            updateRefreshToken(currentRefreshToken, at);
+            updateExistingRefreshToken(currentRefreshToken, at);
         }
         return at;
     }
