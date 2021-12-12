diff --git a/framework/src/org/apache/cordova/CameraLauncher.java b/framework/src/org/apache/cordova/CameraLauncher.java
index 04cd1c0..cfe58a6 100755
--- a/framework/src/org/apache/cordova/CameraLauncher.java
+++ b/framework/src/org/apache/cordova/CameraLauncher.java
@@ -559,7 +559,7 @@
         Cursor cursor = queryImgDB(contentStore);
         int currentNumOfImages = cursor.getCount();
 
-        if (type == FILE_URI) {
+        if (type == FILE_URI && this.saveToPhotoAlbum) {
             diff = 2;
         }
 
