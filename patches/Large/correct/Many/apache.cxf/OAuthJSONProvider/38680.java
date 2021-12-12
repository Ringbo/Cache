diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
index d2a6766..42f039a 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
@@ -94,7 +94,7 @@
                 sb.append(",");
                 appendJsonPair(sb, OAuthConstants.SCOPE, obj.getScope());
             }
-            if (StringUtils.isEmpty(obj.getAud())) {
+            if (!StringUtils.isEmpty(obj.getAud())) {
                 sb.append(",");
                 if (obj.getAud().size() == 1) {
                     appendJsonPair(sb, "aud", obj.getAud());
