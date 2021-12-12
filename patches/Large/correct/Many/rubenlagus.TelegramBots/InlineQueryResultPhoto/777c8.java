diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultPhoto.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultPhoto.java
index ccfa279..e9d6490 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultPhoto.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultPhoto.java
@@ -30,7 +30,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "photo"; ///< Type of the result, must be “photo”
+    private final String type = "photo"; ///< Type of the result, must be “photo”
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(PHOTOURL_FIELD)
@@ -58,7 +58,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
