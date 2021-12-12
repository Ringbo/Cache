diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
index d3c16fa..06f9d62 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/TypeAssertionIntention.java
@@ -42,7 +42,7 @@
 
   public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
     PsiElement elementAt = PyUtil.findNonWhitespaceAtOffset(file, editor.getCaretModel().getOffset());
-    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyQualifiedExpression.class);
+    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyReferenceExpression.class);
     if (problemElement == null) return false;
     if (problemElement.getParent() instanceof PyWithItem) return false;
     if (problemElement instanceof PyQualifiedExpression) {
@@ -65,7 +65,7 @@
 
   public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
     PsiElement elementAt = PyUtil.findNonWhitespaceAtOffset(file, editor.getCaretModel().getOffset());
-    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyQualifiedExpression.class);
+    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyReferenceExpression.class);
     if (problemElement != null) {
       PyElementGenerator elementGenerator = PyElementGenerator.getInstance(project);
 
