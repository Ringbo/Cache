diff --git a/src/org/qii/weiciyuan/ui/browser/BrowserBigPicActivity.java b/src/org/qii/weiciyuan/ui/browser/BrowserBigPicActivity.java
index f0a34ab..d5cbf2f 100644
--- a/src/org/qii/weiciyuan/ui/browser/BrowserBigPicActivity.java
+++ b/src/org/qii/weiciyuan/ui/browser/BrowserBigPicActivity.java
@@ -145,7 +145,7 @@
                 if (!TextUtils.isEmpty(path)) {
                     new File(path).delete();
                 }
-                if (oriMenu.isVisible()) {
+                if (oriMenu.isVisible() || TextUtils.isEmpty(oriUrl)) {
                     task = new PicSimpleBitmapWorkerTask(url);
                 } else {
                     task = new PicSimpleBitmapWorkerTask(oriUrl);
