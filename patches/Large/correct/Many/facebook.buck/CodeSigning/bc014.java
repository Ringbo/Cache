diff --git a/src/com/facebook/buck/apple/CodeSigning.java b/src/com/facebook/buck/apple/CodeSigning.java
index e363450..0f98902 100644
--- a/src/com/facebook/buck/apple/CodeSigning.java
+++ b/src/com/facebook/buck/apple/CodeSigning.java
@@ -48,7 +48,7 @@
 
     // Specify that stdout is expected, or else output may be wrapped in Ansi escape chars.
     Set<ProcessExecutor.Option> options =
-        EnumSet.of(ProcessExecutor.Option.EXPECTING_STD_OUT);
+        EnumSet.of(ProcessExecutor.Option.EXPECTING_STD_OUT, ProcessExecutor.Option.IS_SILENT);
 
     ProcessExecutor.Result result = processExecutor.launchAndExecute(
         processExecutorParams,
