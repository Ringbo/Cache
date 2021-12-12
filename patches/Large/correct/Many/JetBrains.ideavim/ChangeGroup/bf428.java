diff --git a/src/com/maddyhome/idea/vim/group/ChangeGroup.java b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
index 3e45ca9..0f787a0 100644
--- a/src/com/maddyhome/idea/vim/group/ChangeGroup.java
+++ b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
@@ -451,7 +451,7 @@
     if (repeatLines > 0) {
       int vline = editor.getCaretModel().getVisualPosition().line;
       int lline = editor.getCaretModel().getLogicalPosition().line;
-      cpos = editor.logicalPositionToOffset(new LogicalPosition(vline, repeatColumn));
+      cpos = editor.logicalPositionToOffset(new LogicalPosition(lline, repeatColumn));
       for (int i = 0; i < repeatLines; i++) {
         if (repeatAppend && repeatColumn < MotionGroup.LAST_COLUMN &&
             EditorHelper.getVisualLineLength(editor, vline + i) < repeatColumn) {
