diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
index 0914d2e..7d629a2 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
@@ -47,7 +47,7 @@
     myText = PyBundle.message("INTN.specify.type");
     PsiElement elementAt = PyUtil.findNonWhitespaceAtOffset(file, editor.getCaretModel().getOffset());
     if (elementAt == null) return false;
-    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyNamedParameter.class, PyQualifiedExpression.class);
+    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyNamedParameter.class, PyReferenceExpression.class);
     if (checkAvailableForReturn(elementAt)) return true;
 
 
@@ -134,7 +134,7 @@
     String kind = "type";
     PyFunction pyFunction = PsiTreeUtil.getParentOfType(elementAt, PyFunction.class);
 
-    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyNamedParameter.class, PyQualifiedExpression.class);
+    PyExpression problemElement = PsiTreeUtil.getParentOfType(elementAt, PyNamedParameter.class, PyReferenceExpression.class);
     PyAssignmentStatement assignmentStatement = PsiTreeUtil.getParentOfType(elementAt, PyAssignmentStatement.class);
     PyCallExpression callExpression = null;
     if (assignmentStatement != null) {
