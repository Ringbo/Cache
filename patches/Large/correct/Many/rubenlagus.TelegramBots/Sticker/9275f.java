diff --git a/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java b/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
index 7ac6b04..38f2987 100644
--- a/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
+++ b/src/main/java/org/telegram/telegrambots/api/objects/Sticker.java
@@ -51,15 +51,15 @@
         }
     }
     
-        public Integer getFileId() {
+        public String getFileId() {
         return fileId;
     }
 
-    public String getWidth() {
+    public Integer getWidth() {
         return width;
     }
 
-    public String getHeight() {
+    public Integer getHeight() {
         return height;
     }
 
@@ -67,7 +67,7 @@
         return thumb;
     }
     
-    public String getFileSize() {
+    public Integer getFileSize() {
         return fileSize;
     }
 
