diff --git a/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java b/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
index 42fe897..7c6475d 100644
--- a/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
+++ b/core/java/android/hardware/camera2/legacy/LegacyRequestMapper.java
@@ -45,6 +45,7 @@
     private static final String TAG = "LegacyRequestMapper";
     private static final boolean VERBOSE = Log.isLoggable(TAG, Log.VERBOSE);
 
+    /** Default quality for android.jpeg.quality, android.jpeg.thumbnailQuality */
     private static final byte DEFAULT_JPEG_QUALITY = 85;
 
     /**
@@ -410,8 +411,8 @@
 
         // jpeg.thumbnailQuality
         {
-            params.setJpegQuality(0xFF & ParamsUtils.getOrDefault(request, JPEG_THUMBNAIL_QUALITY,
-                    DEFAULT_JPEG_QUALITY));
+            params.setJpegThumbnailQuality(0xFF & ParamsUtils.getOrDefault(request,
+                    JPEG_THUMBNAIL_QUALITY, DEFAULT_JPEG_QUALITY));
         }
 
         // jpeg.thumbnailSize
