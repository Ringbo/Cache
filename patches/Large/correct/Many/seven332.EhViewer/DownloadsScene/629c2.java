diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
index d3aa5e1..7bf25e9 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
@@ -329,12 +329,12 @@
 
     private void guide() {
         if (Settings.getGuideDownloadThumb()) {
-            SimpleHandler.getInstance().post(new Runnable() {
+            SimpleHandler.getInstance().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     guideDownloadThumb();
                 }
-            });
+            }, 300);
         } else {
             guideDownloadLabels();
         }
