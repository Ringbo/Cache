diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultArticle.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultArticle.java
index 9c8a321..ba4e4c4 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultArticle.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultArticle.java
@@ -27,7 +27,7 @@
     private static final String THUMBHEIGHT_FIELD = "thumb_height";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "article"; ///< Type of the result, must be “article”
+    private final String type = "article"; ///< Type of the result, must be “article”
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(TITLE_FIELD)
@@ -53,7 +53,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
