diff --git a/python/src/com/jetbrains/python/editor/PythonEnterHandler.java b/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
index 4521a6d..734e11b 100644
--- a/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
+++ b/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
@@ -307,7 +307,7 @@
     }
     PyFromImportStatement fromImportStatement = (PyFromImportStatement)statement;
     PsiElement leftParen = fromImportStatement.getLeftParen();
-    if (leftParen != null && offset > leftParen.getTextRange().getEndOffset()) {
+    if (leftParen != null && offset >= leftParen.getTextRange().getEndOffset()) {
       return true;
     }
     return false;
