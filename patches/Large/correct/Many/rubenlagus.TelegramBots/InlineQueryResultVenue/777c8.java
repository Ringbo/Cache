diff --git a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVenue.java b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVenue.java
index 9b3f3cd..894e7e2 100644
--- a/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVenue.java
+++ b/telegrambots-meta/src/main/java/org/telegram/telegrambots/api/objects/inlinequery/result/InlineQueryResultVenue.java
@@ -31,7 +31,7 @@
     private static final String THUMBHEIGHT_FIELD = "thumb_height";
 
     @JsonProperty(TYPE_FIELD)
-    private static final String type = "venue"; ///< Type of the result, must be "venue"
+    private final String type = "venue"; ///< Type of the result, must be "venue"
     @JsonProperty(ID_FIELD)
     private String id; ///< Unique identifier of this result, 1-64 bytes
     @JsonProperty(TITLE_FIELD)
@@ -59,7 +59,7 @@
         super();
     }
 
-    public static String getType() {
+    public String getType() {
         return type;
     }
 
