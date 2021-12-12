diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
index 80308a9..cfdff29 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
@@ -916,8 +916,9 @@
                 mEditorImageMetaData.setLinkUrl(linkUrl);
                 mEditorImageMetaData.setLinkTargetBlank(linkTargetBlank);
 
-                // size affects multiple attributes, so we want to make sure we updated them only if they were changed
-                if (hasSizeChanged) {
+                // we only update width and height attributes on self hosted and Jetpack sites
+                // because css image size classes wont have any effect there
+                if (!mSite.isWPCom() && hasSizeChanged) {
                     updateImageSizeParameters();
                 }
 
@@ -932,7 +933,8 @@
     }
 
     private void updateImageSizeParameters() {
-        if (mImageSize == MediaSettingsImageSize.FULL) {
+        // if caption is empty we can safely remove width and height attributes
+        if (mImageSize == MediaSettingsImageSize.FULL && TextUtils.isEmpty(mEditorImageMetaData.getCaption())) {
             mEditorImageMetaData.setWidth(null);
             mEditorImageMetaData.setHeight(null);
             return;
@@ -1118,11 +1120,11 @@
     }
 
     public enum MediaSettingsImageSize {
-        THUMBNAIL(R.string.image_size_thumbnail_label, R.string.image_size_thumbnail_class,
+        THUMBNAIL(R.string.image_size_thumbnail_label, R.string.image_size_thumbnail_css_class,
                 R.integer.image_size_thumbnail_px),
-        MEDIUM(R.string.image_size_medium_label, R.string.image_size_medium_class, R.integer.image_size_medium_px),
-        LARGE(R.string.image_size_large_label, R.string.image_size_large_class, R.integer.image_size_large_px),
-        FULL(R.string.image_size_full_label, R.string.image_size_full_class, -1);
+        MEDIUM(R.string.image_size_medium_label, R.string.image_size_medium_css_class, R.integer.image_size_medium_px),
+        LARGE(R.string.image_size_large_label, R.string.image_size_large_css_class, R.integer.image_size_large_px),
+        FULL(R.string.image_size_full_label, R.string.image_size_full_css_class, R.integer.image_size_large_px);
 
         private final int mLabel;
         private final int mCssClass;
