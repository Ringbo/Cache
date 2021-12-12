diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultMpeg4Gif.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultMpeg4Gif.java
index 6e3e38a..6ee2afc 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultMpeg4Gif.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultMpeg4Gif.java
@@ -28,7 +28,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "mpeg4_gif"; ///< Type of the result, must be "mpeg4_gif"
+    private final String type = "mpeg4_gif"; ///< Type of the result, must be "mpeg4_gif"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(MPEG4URL_FIELD)
@@ -52,7 +52,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
