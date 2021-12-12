diff --git a/library/src/com/bumptech/photos/resize/ImageResizer.java b/library/src/com/bumptech/photos/resize/ImageResizer.java
index 01da903..0832e77 100644
--- a/library/src/com/bumptech/photos/resize/ImageResizer.java
+++ b/library/src/com/bumptech/photos/resize/ImageResizer.java
@@ -297,7 +297,7 @@
 
     private Bitmap decodeStream(InputStream is, BitmapFactory.Options decodeBitmapOptions) {
         final byte[][] tempBytes = getTempBytes();
-        ReycleableBufferedInputStream bis = new ReycleableBufferedInputStream(is, tempBytes[0]);
+        RecyclableBufferedInputStream bis = new RecyclableBufferedInputStream(is, tempBytes[0]);
         decodeBitmapOptions.inTempStorage = tempBytes[1];
         Bitmap result = null;
         try {
