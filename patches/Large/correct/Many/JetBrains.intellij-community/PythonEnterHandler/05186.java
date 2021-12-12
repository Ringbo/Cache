diff --git a/python/src/com/jetbrains/python/editor/PythonEnterHandler.java b/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
index e2d5275..486ef1b 100644
--- a/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
+++ b/python/src/com/jetbrains/python/editor/PythonEnterHandler.java
@@ -139,7 +139,7 @@
     }
     if (offset > 0) {
       final PsiElement beforeCaret = file.findElementAt(offset - 1);
-      if (beforeCaret instanceof PsiWhiteSpace && beforeCaret.getText().indexOf('\\') > 0) {
+      if (beforeCaret instanceof PsiWhiteSpace && beforeCaret.getText().indexOf('\\') >= 0) {
         // we've got a backslash at EOL already, don't need another one
         return Result.Continue;
       }
