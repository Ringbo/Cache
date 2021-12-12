diff --git a/plugins/git4idea/src/git4idea/commands/GitImpl.java b/plugins/git4idea/src/git4idea/commands/GitImpl.java
index c938a66..6c9d39c 100644
--- a/plugins/git4idea/src/git4idea/commands/GitImpl.java
+++ b/plugins/git4idea/src/git4idea/commands/GitImpl.java
@@ -641,7 +641,7 @@
   @NotNull
   private static GitCommandResult toCancelledResult(@NotNull GitCommandResult result) {
     int exitCode = result.getExitCode() == 0 ? 1 : result.getExitCode();
-    return new GitCommandResult(false, exitCode, result.getErrorOutput(), result.getOutput()) {
+    return new GitCommandResult(false, exitCode, false, result.getErrorOutput(), result.getOutput()) {
       @Override
       public boolean cancelled() {
         return true;
