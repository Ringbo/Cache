diff --git a/platform/lang-api/src/com/intellij/ide/util/projectWizard/ModuleBuilder.java b/platform/lang-api/src/com/intellij/ide/util/projectWizard/ModuleBuilder.java
index f2ea7bc..43e54b1 100644
--- a/platform/lang-api/src/com/intellij/ide/util/projectWizard/ModuleBuilder.java
+++ b/platform/lang-api/src/com/intellij/ide/util/projectWizard/ModuleBuilder.java
@@ -155,7 +155,7 @@
     if (model == null) moduleModel.commit();
 
     if (runFromProjectWizard) {
-      StartupManager.getInstance(module.getProject()).registerPostStartupActivity(new DumbAwareRunnable() {
+      StartupManager.getInstance(module.getProject()).runWhenProjectIsInitialized(new DumbAwareRunnable() {
       public void run() {
         ApplicationManager.getApplication().runWriteAction(new Runnable() {
           public void run() {
