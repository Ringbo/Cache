diff --git a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
index 693471a..b373b03 100644
--- a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
+++ b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
@@ -86,7 +86,7 @@
 
   public PsiElement reformatRange(PsiElement element, int startOffset, int endOffset)
     throws IncorrectOperationException {
-    return reformatRangeImpl(element, startOffset, endOffset, true);
+    return reformatRangeImpl(element, startOffset, endOffset, false);
 
   }
 
