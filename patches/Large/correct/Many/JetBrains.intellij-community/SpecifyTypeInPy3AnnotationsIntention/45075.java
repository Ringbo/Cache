diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
index d33c9e2..fe823ce 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
@@ -51,7 +51,7 @@
       elementAt = file.findElementAt(editor.getCaretModel().getOffset());
 
     PyCallExpression callExpression = PsiTreeUtil.getParentOfType(elementAt, PyCallExpression.class);
-    if (callExpression != null ) {
+    if (callExpression != null && callExpression.resolveCalleeFunction(PyResolveContext.defaultContext()) != null) {
       PyAssignmentStatement assignmentStatement = PsiTreeUtil.getParentOfType(elementAt, PyAssignmentStatement.class);
       if (assignmentStatement != null) {
         PyType type = assignmentStatement.getAssignedValue().getType(TypeEvalContext.slow());
