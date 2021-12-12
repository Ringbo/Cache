diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultAudio.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultAudio.java
index fd3d70d..9cb42c4 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultAudio.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultAudio.java
@@ -29,7 +29,7 @@
     private static final String CAPTION_FIELD = "caption";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "audio"; ///< Type of the result, must be "audio"
+    private final String type = "audio"; ///< Type of the result, must be "audio"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result
     @JsonProperty(AUDIOURL_FIELD)
@@ -51,7 +51,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
