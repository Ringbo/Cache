diff --git a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
index f11f76a..1128ada 100644
--- a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
+++ b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
@@ -71,7 +71,9 @@
       @Override
       public void onLineAvailable(@NonNls String line, Key outputType) {
         String lowerCaseLine = line.toLowerCase();
-        if (lowerCaseLine.contains("authentication failed") || lowerCaseLine.contains("403 forbidden")) {
+        if (lowerCaseLine.contains("authentication failed") ||
+            lowerCaseLine.contains("403 forbidden") ||
+            lowerCaseLine.contains("error: 400")) {
           LOG.debug("auth listener: auth failure detected: " + line);
           myHttpAuthFailed = true;
         }
