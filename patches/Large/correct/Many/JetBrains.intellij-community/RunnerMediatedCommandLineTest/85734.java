diff --git a/platform/platform-tests/testSrc/com/intellij/execution/process/RunnerMediatedCommandLineTest.java b/platform/platform-tests/testSrc/com/intellij/execution/process/RunnerMediatedCommandLineTest.java
index 439e378..18e3c5d 100644
--- a/platform/platform-tests/testSrc/com/intellij/execution/process/RunnerMediatedCommandLineTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/execution/process/RunnerMediatedCommandLineTest.java
@@ -32,7 +32,7 @@
   @NotNull
   @Override
   protected GeneralCommandLine postProcessCommandLine(@NotNull GeneralCommandLine commandLine) {
-    boolean injected = RunnerMediator.injectRunnerCommand(super.postProcessCommandLine(commandLine));
+    boolean injected = RunnerMediator.injectRunnerCommand(super.postProcessCommandLine(commandLine), false);
     assumeTrue("runner mediator not found", injected);
     return commandLine;
   }
