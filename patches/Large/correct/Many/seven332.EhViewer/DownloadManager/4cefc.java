diff --git a/app/src/main/java/com/hippo/ehviewer/service/DownloadManager.java b/app/src/main/java/com/hippo/ehviewer/service/DownloadManager.java
index 5097351..3205222 100644
--- a/app/src/main/java/com/hippo/ehviewer/service/DownloadManager.java
+++ b/app/src/main/java/com/hippo/ehviewer/service/DownloadManager.java
@@ -470,7 +470,7 @@
                 infoList.remove(info);
             }
             // remove download info from DB
-            DBUtils.removeDownloadLabel(info.galleryBase.gid);
+            DBUtils.removeDownloadInfo(info.galleryBase.gid);
             // Set mode read for available gallery spider
             GallerySpider.forceSetMode(info.galleryBase, ImageHandler.Mode.READ);
             // TODO do it in new thread
