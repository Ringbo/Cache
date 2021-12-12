diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/AbstractGrant.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/AbstractGrant.java
index 55fe488..dbbaa7f 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/AbstractGrant.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/grants/AbstractGrant.java
@@ -65,7 +65,7 @@
             map.putSingle(OAuthConstants.SCOPE, scope);
         }
         if (audience != null) {
-            map.putSingle(OAuthConstants.CLIENT_AUDIENCE, scope);
+            map.putSingle(OAuthConstants.CLIENT_AUDIENCE, audience);
         }
         return map;
     }
