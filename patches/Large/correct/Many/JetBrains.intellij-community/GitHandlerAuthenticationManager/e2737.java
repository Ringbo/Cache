diff --git a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
index 5c8f8bf..85481f5 100644
--- a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
+++ b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
@@ -73,7 +73,8 @@
         String lowerCaseLine = line.toLowerCase();
         if (lowerCaseLine.contains("authentication failed") ||
             lowerCaseLine.contains("403 forbidden") ||
-            lowerCaseLine.contains("error: 400")) {
+            lowerCaseLine.contains("error: 400") ||
+            (lowerCaseLine.contains("fatal: repository") && lowerCaseLine.contains("not found"))) {
           LOG.debug("auth listener: auth failure detected: " + line);
           myHttpAuthFailed = true;
         }
