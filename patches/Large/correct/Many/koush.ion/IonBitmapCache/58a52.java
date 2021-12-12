diff --git a/ion/src/com/koushikdutta/ion/bitmap/IonBitmapCache.java b/ion/src/com/koushikdutta/ion/bitmap/IonBitmapCache.java
index 6c3c81f..7627b19 100644
--- a/ion/src/com/koushikdutta/ion/bitmap/IonBitmapCache.java
+++ b/ion/src/com/koushikdutta/ion/bitmap/IonBitmapCache.java
@@ -81,11 +81,11 @@
         assert Thread.currentThread() != Looper.getMainLooper().getThread();
         int targetWidth = minx;
         int targetHeight = miny;
-        if (targetWidth <= 0)
+        if (targetWidth == 0)
             targetWidth = metrics.widthPixels;
         if (targetWidth <= 0)
             targetWidth = Integer.MAX_VALUE;
-        if (targetHeight <= 0)
+        if (targetHeight == 0)
             targetHeight = metrics.heightPixels;
         if (targetHeight <= 0)
             targetHeight = Integer.MAX_VALUE;
@@ -97,7 +97,7 @@
             BitmapFactory.decodeByteArray(bytes, offset, length, o);
             if (o.outWidth < 0 || o.outHeight < 0)
                 return null;
-            int scale = Math.min(o.outWidth / targetWidth, o.outHeight / targetHeight);
+            int scale = Math.max(o.outWidth / targetWidth, o.outHeight / targetHeight);
             o = new BitmapFactory.Options();
             o.inSampleSize = scale;
         }
@@ -133,7 +133,7 @@
             catch (Exception e) {
                 return null;
             }
-            int scale = Math.min(o.outWidth / targetWidth, o.outHeight / targetHeight);
+            int scale = Math.max(o.outWidth / targetWidth, o.outHeight / targetHeight);
             o = new BitmapFactory.Options();
             o.inSampleSize = scale;
         }
