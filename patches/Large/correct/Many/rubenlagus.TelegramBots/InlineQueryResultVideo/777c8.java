diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVideo.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVideo.java
index 23aa489..3097869 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVideo.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVideo.java
@@ -31,7 +31,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "video"; ///< Type of the result, must be "video"
+    private final String type = "video"; ///< Type of the result, must be "video"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result
     @JsonProperty(MIMETYPE_FIELD)
@@ -61,7 +61,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
