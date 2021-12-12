diff --git a/src/com/goide/util/GoExecutor.java b/src/com/goide/util/GoExecutor.java
index 0fcb876..77414d3 100644
--- a/src/com/goide/util/GoExecutor.java
+++ b/src/com/goide/util/GoExecutor.java
@@ -213,7 +213,7 @@
     try {
       commandLine = createCommandLine();
       GeneralCommandLine finalCommandLine = commandLine;
-      myProcessHandler = new KillableColoredProcessHandler(finalCommandLine) {
+      myProcessHandler = new KillableColoredProcessHandler(finalCommandLine, true) {
         @Override
         public void startNotify() {
           if (myShowGoEnvVariables) {
