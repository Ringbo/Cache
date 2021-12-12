diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedPhoto.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedPhoto.java
index 388e1cd..b15b514 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedPhoto.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/chached/InlineQueryResultCachedPhoto.java
@@ -27,7 +27,7 @@
     private static final String REPLY_MARKUP_FIELD = "reply_markup";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "photo"; ///< Type of the result, must be “photo”
+    private final String type = "photo"; ///< Type of the result, must be “photo”
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(PHOTOFILEID_FIELD)
@@ -47,7 +47,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
