diff --git a/src/com/maddyhome/idea/vim/group/ChangeGroup.java b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
index 22d8976..c6f1bda 100644
--- a/src/com/maddyhome/idea/vim/group/ChangeGroup.java
+++ b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
@@ -211,12 +211,12 @@
    * @param context The data context
    */
   public void insertAtPreviousInsert(Editor editor, DataContext context) {
-    int offset = CommandGroups.getInstance().getMotion().moveCaretToFileMarkLine(editor, '^');
+    int offset = CommandGroups.getInstance().getMotion().moveCaretToMark(editor, context, '^');
     if (offset != -1) {
       MotionGroup.moveCaret(editor, context, offset);
     }
 
-    insertBeforeCursor(editor, context);
+    insertAfterCursor(editor, context);
   }
 
   /**
