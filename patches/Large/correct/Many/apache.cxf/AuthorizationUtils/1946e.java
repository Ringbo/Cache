diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/AuthorizationUtils.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/AuthorizationUtils.java
index a22f171..09df5ef 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/AuthorizationUtils.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/AuthorizationUtils.java
@@ -73,7 +73,7 @@
                                                  Set<String> challenges,
                                                  String realm) {
         List<String> headers = mc.getHttpHeaders().getRequestHeader("Authorization");
-        if (headers.size() == 1) {
+        if (headers != null && headers.size() == 1) {
             String[] parts = headers.get(0).split(" ");
             if (parts.length > 0 
                 && (challenges == null || challenges.isEmpty() || challenges.contains(parts[0]))) {
