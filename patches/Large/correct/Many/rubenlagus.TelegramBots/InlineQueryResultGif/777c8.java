diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGif.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGif.java
index 660b846..617a2cc 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGif.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGif.java
@@ -28,7 +28,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "gif"; ///< Type of the result, must be "gif"
+    private final String type = "gif"; ///< Type of the result, must be "gif"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(GIFURL_FIELD)
@@ -52,7 +52,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
