diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
index d258393..b59030b 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
@@ -54,7 +54,7 @@
       elementAt = file.findElementAt(editor.getCaretModel().getOffset());
 
     PyCallExpression callExpression = PsiTreeUtil.getParentOfType(elementAt, PyCallExpression.class);
-    if (callExpression != null ) {
+    if (callExpression != null && callExpression.resolveCalleeFunction(PyResolveContext.defaultContext()) != null) {
       PyAssignmentStatement assignmentStatement = PsiTreeUtil.getParentOfType(elementAt, PyAssignmentStatement.class);
       if (assignmentStatement != null) {
         PyType type = assignmentStatement.getAssignedValue().getType(TypeEvalContext.slow());
