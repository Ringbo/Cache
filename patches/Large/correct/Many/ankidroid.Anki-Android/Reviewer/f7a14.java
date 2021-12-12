diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/Reviewer.java b/AnkiDroid/src/main/java/com/ichi2/anki/Reviewer.java
index 1522fa6..cd0b89f 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/Reviewer.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/Reviewer.java
@@ -226,7 +226,7 @@
             menu.findItem(R.id.action_hide_whiteboard).setVisible(true);
             menu.findItem(R.id.action_clear_whiteboard).setVisible(true);
 
-            Drawable whiteboardIcon = getResources().getDrawable(R.drawable.ic_gesture_white_24dp, null);
+            Drawable whiteboardIcon = getResources().getDrawable(R.drawable.ic_gesture_white_24dp);
             if (mShowWhiteboard) {
                 whiteboardIcon.setAlpha(255);
                 menu.findItem(R.id.action_hide_whiteboard).setIcon(whiteboardIcon);
