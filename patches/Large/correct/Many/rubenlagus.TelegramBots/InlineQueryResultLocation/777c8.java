diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultLocation.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultLocation.java
index 3408578..fa3b973 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultLocation.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultLocation.java
@@ -30,7 +30,7 @@
     private static final String THUMBHEIGHT_FIELD = "thumb_height";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "location"; ///< Type of the result, must be "location"
+    private final String type = "location"; ///< Type of the result, must be "location"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(TITLE_FIELD)
@@ -54,7 +54,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
