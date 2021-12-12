diff --git a/ion/src/com/koushikdutta/ion/loader/VideoLoader.java b/ion/src/com/koushikdutta/ion/loader/VideoLoader.java
index 57e327a..3878188 100644
--- a/ion/src/com/koushikdutta/ion/loader/VideoLoader.java
+++ b/ion/src/com/koushikdutta/ion/loader/VideoLoader.java
@@ -92,7 +92,7 @@
         final File file = new File(URI.create(uri));
 
         MediaFile.MediaFileType type = MediaFile.getFileType(file.getAbsolutePath());
-        if (!MediaFile.isVideoFileType(type.fileType))
+        if (type == null || !MediaFile.isVideoFileType(type.fileType))
             return null;
 
         final SimpleFuture<BitmapInfo> ret = new SimpleFuture<BitmapInfo>();
