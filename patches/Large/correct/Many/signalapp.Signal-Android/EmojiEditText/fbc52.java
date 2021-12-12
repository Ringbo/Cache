diff --git a/src/org/thoughtcrime/securesms/components/emoji/EmojiEditText.java b/src/org/thoughtcrime/securesms/components/emoji/EmojiEditText.java
index 66c8fa1..e9f032b 100644
--- a/src/org/thoughtcrime/securesms/components/emoji/EmojiEditText.java
+++ b/src/org/thoughtcrime/securesms/components/emoji/EmojiEditText.java
@@ -35,7 +35,7 @@
     final int          end   = getSelectionEnd();
 
     getText().replace(Math.min(start, end), Math.max(start, end), emoji);
-    setSelection(end + emoji.length());
+    setSelection(start + emoji.length());
   }
 
   @Override public void invalidateDrawable(@NonNull Drawable drawable) {
