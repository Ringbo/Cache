diff --git a/platform-impl/src/com/intellij/ui/EditorTextField.java b/platform-impl/src/com/intellij/ui/EditorTextField.java
index a14a6bc..4118e10 100644
--- a/platform-impl/src/com/intellij/ui/EditorTextField.java
+++ b/platform-impl/src/com/intellij/ui/EditorTextField.java
@@ -322,7 +322,7 @@
 
     setupEditorFont(editor);
 
-    if (myProject != null) {
+    if (myProject != null && myFileType != null) {
       editor.setHighlighter(EditorHighlighterFactory.getInstance().createEditorHighlighter(myProject, myFileType));
     }
     editor.getColorsScheme().setColor(EditorColors.CARET_ROW_COLOR, null);
