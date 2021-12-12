diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
index 5a6ee9b..37200af 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
@@ -56,7 +56,7 @@
 
     if (checkAvailableForReturn(elementAt)) return true;
 
-    PyExpression problemElement = PyUtil.findProblemElement(editor, file, PyNamedParameter.class, PyQualifiedExpression.class);
+    PyExpression problemElement = PyUtil.findProblemElement(editor, file, PyNamedParameter.class, PyReferenceExpression.class);
 
     if (problemElement == null) return false;
     if (problemElement instanceof PyQualifiedExpression) {
@@ -145,7 +145,7 @@
   }
 
   public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
-    PyExpression problemElement = PyUtil.findProblemElement(editor, file, PyNamedParameter.class, PyQualifiedExpression.class);
+    PyExpression problemElement = PyUtil.findProblemElement(editor, file, PyNamedParameter.class, PyReferenceExpression.class);
     PyParameter parameter = null;
     PsiReference reference = null;
     String name = null;
