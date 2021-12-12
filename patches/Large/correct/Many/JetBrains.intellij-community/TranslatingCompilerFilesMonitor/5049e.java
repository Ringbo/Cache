diff --git a/compiler/impl/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java b/compiler/impl/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
index 6faa654..964b5af 100644
--- a/compiler/impl/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
+++ b/compiler/impl/com/intellij/compiler/impl/TranslatingCompilerFilesMonitor.java
@@ -915,7 +915,7 @@
         // need read action to ensure that the project was not disposed during the iteration over the project list
         public void run() {
           for (final Project project : myProjectManager.getOpenProjects()) {
-            if (project.isInitialized()) {
+            if (!project.isInitialized()) {
               continue; // the content of this project will be scanned during its post-startup activities
             }
             final ProjectRootManager rootManager = ProjectRootManager.getInstance(project);
