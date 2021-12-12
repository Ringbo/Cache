diff --git a/refactoring/impl/com/intellij/refactoring/util/RefactoringUtil.java b/refactoring/impl/com/intellij/refactoring/util/RefactoringUtil.java
index 7dbb40f..5a7b9e3 100644
--- a/refactoring/impl/com/intellij/refactoring/util/RefactoringUtil.java
+++ b/refactoring/impl/com/intellij/refactoring/util/RefactoringUtil.java
@@ -1469,7 +1469,7 @@
             final PsiElement resolved = reference.resolve();
             if (resolved instanceof PsiTypeParameter) {
               final PsiTypeParameter typeParameter = (PsiTypeParameter)resolved;
-              if (PsiTreeUtil.isAncestor(typeParameter.getOwner(), element, false)) {
+              if (PsiTreeUtil.isAncestor(typeParameter.getOwner(), element, true)) {
                 used.add(typeParameter);
               }
             }
