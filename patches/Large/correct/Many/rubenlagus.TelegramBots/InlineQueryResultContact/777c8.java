diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultContact.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultContact.java
index aa5aafe..3352275 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultContact.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultContact.java
@@ -30,7 +30,7 @@
     private static final String THUMBHEIGHT_FIELD = "thumb_height";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "contact"; ///< Type of the result, must be "contact"
+    private final String type = "contact"; ///< Type of the result, must be "contact"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(PHONE_NUMBER_FIELD)
@@ -54,7 +54,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
