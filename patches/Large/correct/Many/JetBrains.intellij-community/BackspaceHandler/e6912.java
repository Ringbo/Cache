diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/BackspaceHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/BackspaceHandler.java
index 39b7024..0714bdc 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/BackspaceHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/BackspaceHandler.java
@@ -153,7 +153,7 @@
     if (editor.getSelectionModel().hasSelection() || editor.getSelectionModel().hasBlockSelection()) return null;
 
     LogicalPosition caretPos = editor.getCaretModel().getLogicalPosition();
-    if (caretPos.line == 1 || caretPos.column == 0) {
+    if (caretPos.line == 0 || caretPos.column == 0) {
       return null;
     }
     int lineStartOffset = editor.getDocument().getLineStartOffset(caretPos.line);
