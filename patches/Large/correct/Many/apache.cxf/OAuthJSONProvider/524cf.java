diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
index 1eb9916..7609786 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/OAuthJSONProvider.java
@@ -115,7 +115,7 @@
             }
             if (obj.getIss() != null) {
                 sb.append(",");
-                appendJsonPair(sb, "iss", obj.getExp(), false);
+                appendJsonPair(sb, "iss", obj.getIss(), false);
             }
             sb.append(",");
             appendJsonPair(sb, "iat", obj.getIat(), false);
