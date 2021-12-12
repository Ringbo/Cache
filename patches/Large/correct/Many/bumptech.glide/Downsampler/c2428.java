diff --git a/library/src/com/bumptech/glide/resize/load/Downsampler.java b/library/src/com/bumptech/glide/resize/load/Downsampler.java
index 03543e4..a5bfc93 100644
--- a/library/src/com/bumptech/glide/resize/load/Downsampler.java
+++ b/library/src/com/bumptech/glide/resize/load/Downsampler.java
@@ -119,7 +119,7 @@
         } else {
             // cannot reuse bitmaps when decoding images that are not PNG or JPG.
             // look at : https://groups.google.com/forum/#!msg/android-developers/Mp0MFVFi1Fo/e8ZQ9FGdWdEJ
-            if (!shouldUsePool(bis)) {
+            if (shouldUsePool(bis)) {
                 setInBitmap(options, pool.get(inWidth, inHeight, getConfig(bis)));
             }
         }
