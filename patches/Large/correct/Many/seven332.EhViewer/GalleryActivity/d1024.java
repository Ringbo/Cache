diff --git a/app/src/main/java/com/hippo/ehviewer/ui/GalleryActivity.java b/app/src/main/java/com/hippo/ehviewer/ui/GalleryActivity.java
index 52da8f5..0cc81f1 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/GalleryActivity.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/GalleryActivity.java
@@ -179,7 +179,7 @@
         mAction = savedInstanceState.getString(KEY_ACTION);
         mFilename = savedInstanceState.getString(KEY_FILENAME);
         mGalleryInfo = savedInstanceState.getParcelable(KEY_GALLERY_INFO);
-        mPage = savedInstanceState.getInt(KEY_ACTION, -1);
+        mPage = savedInstanceState.getInt(KEY_PAGE, -1);
         buildProvider();
     }
 
