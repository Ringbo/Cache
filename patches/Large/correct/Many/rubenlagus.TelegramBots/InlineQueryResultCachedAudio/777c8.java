diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedAudio.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedAudio.java
index 3413e3d..3478e0b 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedAudio.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedAudio.java
@@ -27,7 +27,7 @@
     private static final String CAPTION_FIELD = "caption";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "audio"; ///< Type of the result, must be "audio"
+    private final String type = "audio"; ///< Type of the result, must be "audio"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result
     @JsonProperty(AUDIO_FILE_ID_FIELD)
@@ -43,7 +43,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
