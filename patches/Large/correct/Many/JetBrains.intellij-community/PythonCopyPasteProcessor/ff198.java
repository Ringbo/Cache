diff --git a/python/src/com/jetbrains/python/editor/PythonCopyPasteProcessor.java b/python/src/com/jetbrains/python/editor/PythonCopyPasteProcessor.java
index 5992c16..5ce200d 100644
--- a/python/src/com/jetbrains/python/editor/PythonCopyPasteProcessor.java
+++ b/python/src/com/jetbrains/python/editor/PythonCopyPasteProcessor.java
@@ -69,7 +69,7 @@
             if (whiteSpace instanceof PsiWhiteSpace) {
               int relatedOffset = whiteSpace.getTextRange().getEndOffset();
               final int indent = relatedOffset - getLineStartSafeOffset(document, document.getLineNumber(relatedOffset));
-              if (caretOffset > indent) {
+              if (caretOffset > indent && document.getTextLength() > offset + indent) {
                 caretModel.moveToOffset(offset + indent);
                 moved = true;
               }
