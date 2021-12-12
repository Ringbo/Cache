diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedSticker.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedSticker.java
index f23a940..b19f313 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedSticker.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedSticker.java
@@ -26,7 +26,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "sticker"; ///< Type of the result, must be "sticker"
+    private final String type = "sticker"; ///< Type of the result, must be "sticker"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(STICKER_FILE_ID_FIELD)
@@ -40,7 +40,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
