diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/ResourceFilteringTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/ResourceFilteringTest.java
index 12e7e0e..6000e7e 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/ResourceFilteringTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/ResourceFilteringTest.java
@@ -246,7 +246,7 @@
     }
 
     List<VirtualFile> roots = Arrays.asList(ProjectRootManager.getInstance(myProject).getContentSourceRoots());
-    TranslatingCompilerFilesMonitor.getInstance().scanSourceContent(myProject, roots, roots.size());
+    TranslatingCompilerFilesMonitor.getInstance().scanSourceContent(myProject, roots, roots.size(), true);
 
     CompilerManager.getInstance(myProject).make(new CompileStatusNotification() {
       public void finished(boolean aborted, int errors, int warnings, CompileContext compileContext) {
