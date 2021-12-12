diff --git a/src/org/qii/weiciyuan/support/asyncdrawable/ReadWorker.java b/src/org/qii/weiciyuan/support/asyncdrawable/ReadWorker.java
index 2bc195f..bb41f54 100644
--- a/src/org/qii/weiciyuan/support/asyncdrawable/ReadWorker.java
+++ b/src/org/qii/weiciyuan/support/asyncdrawable/ReadWorker.java
@@ -113,7 +113,7 @@
 
                 height = globalContext.getResources().getDimensionPixelSize(R.dimen.timeline_pic_high_thumbnail_height);
                 //8 is  layout padding
-                width = (int) (metrics.widthPixels - (14 + 14) * reSize);
+                width = (int) (metrics.widthPixels - (8 + 8) * reSize);
         }
 
         synchronized (TimeLineBitmapDownloader.pauseReadWorkLock) {
