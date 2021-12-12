diff --git a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
index 85481f5..278c4bb 100644
--- a/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
+++ b/plugins/git4idea/src/git4idea/commands/GitHandlerAuthenticationManager.java
@@ -74,7 +74,8 @@
         if (lowerCaseLine.contains("authentication failed") ||
             lowerCaseLine.contains("403 forbidden") ||
             lowerCaseLine.contains("error: 400") ||
-            (lowerCaseLine.contains("fatal: repository") && lowerCaseLine.contains("not found"))) {
+            (lowerCaseLine.contains("fatal: repository") && lowerCaseLine.contains("not found")) ||
+            lowerCaseLine.contains("[remote rejected] (permission denied)")) {
           LOG.debug("auth listener: auth failure detected: " + line);
           myHttpAuthFailed = true;
         }
