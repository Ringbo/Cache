diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedGif.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedGif.java
index 4a3dbe7..9c8e4a7 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedGif.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedGif.java
@@ -26,7 +26,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "gif"; ///< Type of the result, must be "gif"
+    private final String type = "gif"; ///< Type of the result, must be "gif"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(GIF_FILE_ID_FIELD)
@@ -44,7 +44,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
