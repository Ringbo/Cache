diff --git a/java/compiler/impl/src/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java b/java/compiler/impl/src/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
index e315b88..18e7363 100644
--- a/java/compiler/impl/src/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
+++ b/java/compiler/impl/src/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
@@ -949,7 +949,7 @@
       });
 
       myInitializationInProgress.down();
-      StartupManager.getInstance(project).registerPostStartupActivity(new Runnable() {
+      StartupManager.getInstance(project).runWhenProjectIsInitialized(new Runnable() {
         public void run() {
           new Task.Backgroundable(project, CompilerBundle.message("compiler.initial.scanning.progress.text"), false) {
             public void run(@NotNull final ProgressIndicator indicator) {
