diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVoice.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVoice.java
index 700f8f3..5a3539d 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVoice.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedVoice.java
@@ -28,7 +28,7 @@
     private static final String CAPTION_FIELD = "caption";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "voice"; ///< Type of the result, must be "voice"
+    private final String type = "voice"; ///< Type of the result, must be "voice"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(VOICE_FILE_ID_FIELD)
@@ -46,7 +46,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
