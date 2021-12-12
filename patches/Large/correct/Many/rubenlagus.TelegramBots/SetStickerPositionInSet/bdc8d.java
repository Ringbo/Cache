diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/meta/api/methods/stickers/SetStickerPositionInSet.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/meta/api/methods/stickers/SetStickerPositionInSet.java
index f24fe53..d25aea1 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/meta/api/methods/stickers/SetStickerPositionInSet.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/meta/api/methods/stickers/SetStickerPositionInSet.java
@@ -17,14 +17,14 @@
  * Use this method to move a sticker in a set created by the bot to a specific position. Returns True on success.
  */
 public class SetStickerPositionInSet extends BotApiMethod<Boolean> {
-    private static final String PATH = "getStickerSet";
+    private static final String PATH = "setStickerPositionInSet";
 
     private static final String STICKER_FIELD = "sticker";
     private static final String POSITION_FIELD = "position";
 
     @JsonProperty(STICKER_FIELD)
     private String sticker; ///< File identifier of the sticker
-    @JsonProperty(STICKER_FIELD)
+    @JsonProperty(POSITION_FIELD)
     private Integer position; ///< New sticker position in the set, zero-based
 
     public SetStickerPositionInSet(String sticker, Integer position) {
@@ -61,7 +61,7 @@
         if (sticker == null || sticker.isEmpty()) {
             throw new TelegramApiValidationException("sticker can't be null", this);
         }
-        if (position == null || position > 0) {
+        if (position == null || position < 0) {
             throw new TelegramApiValidationException("position can't be null", this);
         }
     }
@@ -71,7 +71,7 @@
     }
 
     public SetStickerPositionInSet setSticker(String sticker) {
-        this.sticker = sticker;
+        this.sticker = checkNotNull(sticker);
         return this;
     }
 
@@ -80,7 +80,7 @@
     }
 
     public SetStickerPositionInSet setPosition(Integer position) {
-        this.position = position;
+        this.position = checkNotNull(position);
         return this;
     }
 
