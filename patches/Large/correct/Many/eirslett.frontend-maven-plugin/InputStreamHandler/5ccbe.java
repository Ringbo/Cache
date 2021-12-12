diff --git a/frontend-plugin-core/src/main/java/com/github/eirslett/maven/plugins/frontend/lib/InputStreamHandler.java b/frontend-plugin-core/src/main/java/com/github/eirslett/maven/plugins/frontend/lib/InputStreamHandler.java
index f0dd7d5..198c3ee 100644
--- a/frontend-plugin-core/src/main/java/com/github/eirslett/maven/plugins/frontend/lib/InputStreamHandler.java
+++ b/frontend-plugin-core/src/main/java/com/github/eirslett/maven/plugins/frontend/lib/InputStreamHandler.java
@@ -53,8 +53,8 @@
         return new LogLevelAgnosticLogger() {
             @Override
             public void log(String value) {
-                // fix #343
-                if (value.startsWith("npm WARN ")) {
+                // fix #343 and #515
+                if (value.startsWith("npm WARN ") || value.startsWith("warning ")) {
                     logger.warn(value);
                 } else {
                     logger.error(value);
