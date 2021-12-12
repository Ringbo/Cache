diff --git a/src/com/facebook/buck/cli/AbstractCommand.java b/src/com/facebook/buck/cli/AbstractCommand.java
index 8892f33..f71ccae 100644
--- a/src/com/facebook/buck/cli/AbstractCommand.java
+++ b/src/com/facebook/buck/cli/AbstractCommand.java
@@ -221,7 +221,7 @@
   @Override
   public final ExitCode run(CommandRunnerParams params) throws IOException, InterruptedException {
     if (help) {
-      printUsage(params.getConsole().getStdErr());
+      printUsage(params.getConsole().getStdOut());
       return ExitCode.SUCCESS;
     }
     if (params.getConsole().getAnsi().isAnsiTerminal()) {
