diff --git a/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java b/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
index 38f2987..9894a2e 100644
--- a/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
+++ b/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
@@ -63,7 +63,7 @@
         return height;
     }
 
-    public String getThumb() {
+    public PhotoSize getThumb() {
         return thumb;
     }
     
