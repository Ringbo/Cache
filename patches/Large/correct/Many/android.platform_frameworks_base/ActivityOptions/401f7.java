diff --git a/core/java/android/app/ActivityOptions.java b/core/java/android/app/ActivityOptions.java
index cbb93a0..6dead3e 100644
--- a/core/java/android/app/ActivityOptions.java
+++ b/core/java/android/app/ActivityOptions.java
@@ -1244,7 +1244,7 @@
                 // Once we parcel the thumbnail for transfering over to the system, create a copy of
                 // the bitmap to a hardware bitmap and pass through the GraphicBuffer
                 if (mThumbnail != null) {
-                    final Bitmap hwBitmap = mThumbnail.copy(Config.HARDWARE, true /* immutable */);
+                    final Bitmap hwBitmap = mThumbnail.copy(Config.HARDWARE, false /* isMutable */);
                     if (hwBitmap != null) {
                         b.putParcelable(KEY_ANIM_THUMBNAIL, hwBitmap.createGraphicBufferHandle());
                     } else {
