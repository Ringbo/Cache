diff --git a/src/org/qii/weiciyuan/support/gallery/GalleryActivity.java b/src/org/qii/weiciyuan/support/gallery/GalleryActivity.java
index 71be286..eb27d06 100644
--- a/src/org/qii/weiciyuan/support/gallery/GalleryActivity.java
+++ b/src/org/qii/weiciyuan/support/gallery/GalleryActivity.java
@@ -105,7 +105,7 @@
     @Override
     public void onBackPressed() {
 
-        if (rect == null) {
+        if (rect == null || urls.size() > 1) {
             super.onBackPressed();
             return;
         }
