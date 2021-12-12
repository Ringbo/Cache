diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedDocument.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedDocument.java
index 684b3e2..5d0bdbb 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedDocument.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedDocument.java
@@ -30,7 +30,7 @@
     private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "document"; ///< Type of the result, must be "document"
+    private final String type = "document"; ///< Type of the result, must be "document"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(TITLE_FIELD)
@@ -50,7 +50,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
