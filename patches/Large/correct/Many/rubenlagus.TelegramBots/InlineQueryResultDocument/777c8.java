diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultDocument.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultDocument.java
index f9b38a2..a63f8dc 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultDocument.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultDocument.java
@@ -33,7 +33,7 @@
     private static final String THUMBHEIGHT_FIELD = "thumb_height";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "document"; ///< Type of the result, must be "document"
+    private final String type = "document"; ///< Type of the result, must be "document"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(TITLE_FIELD)
@@ -61,7 +61,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
