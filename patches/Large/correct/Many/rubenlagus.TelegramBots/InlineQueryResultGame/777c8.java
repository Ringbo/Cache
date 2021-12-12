diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGame.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGame.java
index 7b4cfbf..04832e8 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGame.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultGame.java
@@ -37,7 +37,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "game"; ///< Type of the result, must be "game"
+    private final String type = "game"; ///< Type of the result, must be "game"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(GAMESHORTNAME_FIELD)
@@ -49,7 +49,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
