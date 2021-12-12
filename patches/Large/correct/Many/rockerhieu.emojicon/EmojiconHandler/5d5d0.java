diff --git a/library/src/main/java/com/rockerhieu/emojicon/EmojiconHandler.java b/library/src/main/java/com/rockerhieu/emojicon/EmojiconHandler.java
index 24cbe11..bd0e6a0 100644
--- a/library/src/main/java/com/rockerhieu/emojicon/EmojiconHandler.java
+++ b/library/src/main/java/com/rockerhieu/emojicon/EmojiconHandler.java
@@ -1420,7 +1420,7 @@
                     icon = getEmojiResource(context, unicode);
                 }
 
-                if (icon == 0 && i + skip < length) {
+                if (icon == 0 && i + skip < textLengthToProcess) {
                     int followUnicode = Character.codePointAt(text, i + skip);
                     if (followUnicode == 0x20e3) {
                         int followSkip = Character.charCount(followUnicode);
