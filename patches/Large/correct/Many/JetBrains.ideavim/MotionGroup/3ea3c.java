diff --git a/src/com/maddyhome/idea/vim/group/MotionGroup.java b/src/com/maddyhome/idea/vim/group/MotionGroup.java
index 15f1b64..abf97ca 100644
--- a/src/com/maddyhome/idea/vim/group/MotionGroup.java
+++ b/src/com/maddyhome/idea/vim/group/MotionGroup.java
@@ -643,7 +643,7 @@
   public int moveCaretToNextParagraph(Editor editor, int count) {
     int res = SearchHelper.findNextParagraph(editor, count, false);
     if (res >= 0) {
-      res = EditorHelper.normalizeOffset(editor, res, false);
+      res = EditorHelper.normalizeOffset(editor, res, true);
     }
     else {
       res = -1;
@@ -655,7 +655,7 @@
   public int moveCaretToNextSentenceStart(Editor editor, int count) {
     int res = SearchHelper.findNextSentenceStart(editor, count, false, true);
     if (res >= 0) {
-      res = EditorHelper.normalizeOffset(editor, res, false);
+      res = EditorHelper.normalizeOffset(editor, res, true);
     }
     else {
       res = -1;
