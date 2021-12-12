diff --git a/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildSession.java b/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildSession.java
index 34c7f8d..e4784bb 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildSession.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/cmdline/BuildSession.java
@@ -596,7 +596,7 @@
         if (!trace.isEmpty()) {
           messageText.append("\n").append(trace);
         }
-        if (error instanceof RebuildRequestedException) {
+        if (error instanceof RebuildRequestedException || cause instanceof IOException) {
           messageText.append("\n").append("Please perform full project rebuild (Build | Rebuild Project)");
         }
         lastMessage = CmdlineProtoUtil.toMessage(mySessionId, CmdlineProtoUtil.createFailure(messageText.toString(), cause));
