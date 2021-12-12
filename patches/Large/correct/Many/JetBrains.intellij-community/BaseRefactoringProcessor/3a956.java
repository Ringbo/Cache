diff --git a/refactoring/impl/com/intellij/refactoring/BaseRefactoringProcessor.java b/refactoring/impl/com/intellij/refactoring/BaseRefactoringProcessor.java
index 7e70bd9..0ef7400 100644
--- a/refactoring/impl/com/intellij/refactoring/BaseRefactoringProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/BaseRefactoringProcessor.java
@@ -330,7 +330,7 @@
     final CodeStyleManager styleManager = PsiManager.getInstance(myProject).getCodeStyleManager();
     for (PsiJavaFile file : javaFiles) {
       try {
-        if (file.getVirtualFile() != null) {
+        if (file.isValid() && file.getVirtualFile() != null) {
           styleManager.removeRedundantImports(file);
         }
       }
