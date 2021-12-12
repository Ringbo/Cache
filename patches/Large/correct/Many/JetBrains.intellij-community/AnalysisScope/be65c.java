diff --git a/source/com/intellij/analysis/AnalysisScope.java b/source/com/intellij/analysis/AnalysisScope.java
index 2eb8f28..e813860 100644
--- a/source/com/intellij/analysis/AnalysisScope.java
+++ b/source/com/intellij/analysis/AnalysisScope.java
@@ -39,7 +39,7 @@
   private final int myType;
   private HashSet<VirtualFile> myFilesSet;
 
-  private boolean myIncludeTestSource = false;
+  private boolean myIncludeTestSource = true;
 
   public AnalysisScope(Project project) {
     myProject = project;
@@ -272,7 +272,7 @@
       final FileIndex moduleFileIndex = ModuleRootManager.getInstance(myModule).getFileIndex();
       moduleFileIndex.iterateContent(new ContentIterator() {
         public boolean processFile(VirtualFile fileOrDir) {
-          if (moduleFileIndex.isContentJavaSourceFile(fileOrDir) && (myIncludeTestSource ? true : moduleFileIndex.isInTestSourceContent(fileOrDir))) {
+          if (moduleFileIndex.isContentJavaSourceFile(fileOrDir) && (myIncludeTestSource ? true : !moduleFileIndex.isInTestSourceContent(fileOrDir))) {
             PsiFile psiFile = PsiManager.getInstance(myModule.getProject()).findFile(fileOrDir);
             LOG.assertTrue(psiFile != null);
             psiFile.accept(visitor);
@@ -287,7 +287,7 @@
         final FileIndex moduleFileIndex = ModuleRootManager.getInstance(module).getFileIndex();
         moduleFileIndex.iterateContent(new ContentIterator() {
           public boolean processFile(VirtualFile fileOrDir) {
-            if (moduleFileIndex.isContentJavaSourceFile(fileOrDir) && (myIncludeTestSource ? true : moduleFileIndex.isInTestSourceContent(fileOrDir))) {
+            if (moduleFileIndex.isContentJavaSourceFile(fileOrDir) && (myIncludeTestSource ? true : !moduleFileIndex.isInTestSourceContent(fileOrDir))) {
               PsiFile psiFile = PsiManager.getInstance(module.getProject()).findFile(fileOrDir);
               LOG.assertTrue(psiFile != null);
               psiFile.accept(visitor);
