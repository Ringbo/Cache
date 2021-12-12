diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVideo.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVideo.java
index 7cb46bf..c0a526f 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVideo.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVideo.java
@@ -27,7 +27,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "video"; ///< Type of the result, must be "video"
+    private final String type = "video"; ///< Type of the result, must be "video"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result
     @JsonProperty(VIDEO_FILE_ID_FIELD)
@@ -47,7 +47,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
