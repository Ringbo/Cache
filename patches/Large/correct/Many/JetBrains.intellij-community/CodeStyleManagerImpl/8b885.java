diff --git a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
index 06580c9..4ea731e 100644
--- a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
+++ b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
@@ -413,7 +413,7 @@
 
   private static PsiElement findElementInTreeWithFormatterEnabled(final PsiFile file, final int offset) {
     final PsiElement bottomost = file.findElementAt(offset);
-    if (bottomost.getLanguage().getFormattingModelBuilder() != null) {
+    if (bottomost != null && bottomost.getLanguage().getFormattingModelBuilder() != null) {
       return bottomost;
     }
 
