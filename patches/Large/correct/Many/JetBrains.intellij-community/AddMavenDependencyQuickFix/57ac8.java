diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/intentions/AddMavenDependencyQuickFix.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/intentions/AddMavenDependencyQuickFix.java
index a7e2e5a..7738298 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/intentions/AddMavenDependencyQuickFix.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/intentions/AddMavenDependencyQuickFix.java
@@ -90,7 +90,7 @@
 
         VirtualFile virtualFile = file.getOriginalFile().getVirtualFile();
         if (virtualFile != null) {
-          isTestSource = ProjectRootManager.getInstance(project).getFileIndex().isInSourceContent(virtualFile);
+          isTestSource = ProjectRootManager.getInstance(project).getFileIndex().isInTestSourceContent(virtualFile);
         }
 
         for (MavenId each : ids) {
