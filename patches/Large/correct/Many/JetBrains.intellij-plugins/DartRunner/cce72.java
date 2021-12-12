diff --git a/Dart/src/com/jetbrains/lang/dart/ide/runner/DartRunner.java b/Dart/src/com/jetbrains/lang/dart/ide/runner/DartRunner.java
index f3a75da..61b1c81 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/runner/DartRunner.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/runner/DartRunner.java
@@ -98,7 +98,7 @@
     final int observatoryPort;
 
     if (runConfiguration instanceof DartRunConfigurationBase) {
-      contextFileOrDir = ((DartRunConfigurationBase)runConfiguration).getRunnerParameters().getDartFile();
+      contextFileOrDir = ((DartRunConfigurationBase)runConfiguration).getRunnerParameters().getDartFileOrDirectory();
 
       final String cwd =
         ((DartRunConfigurationBase)runConfiguration).getRunnerParameters().computeProcessWorkingDirectory(env.getProject());
