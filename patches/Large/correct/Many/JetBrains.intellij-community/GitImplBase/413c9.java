diff --git a/plugins/git4idea/src/git4idea/commands/GitImplBase.java b/plugins/git4idea/src/git4idea/commands/GitImplBase.java
index 2d9db8a..36010a4 100644
--- a/plugins/git4idea/src/git4idea/commands/GitImplBase.java
+++ b/plugins/git4idea/src/git4idea/commands/GitImplBase.java
@@ -190,7 +190,7 @@
       if (outputType == ProcessOutputTypes.STDOUT) {
         myOutputCollector.outputLineReceived(line);
       }
-      else if (outputType == ProcessOutputTypes.STDERR) {
+      else if (outputType == ProcessOutputTypes.STDERR && !looksLikeProgress(line)) {
         myOutputCollector.errorLineReceived(line);
       }
     }
