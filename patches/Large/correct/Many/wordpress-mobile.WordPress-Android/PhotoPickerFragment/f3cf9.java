diff --git a/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerFragment.java
index fd06d6e..352f6c4 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/photopicker/PhotoPickerFragment.java
@@ -159,7 +159,8 @@
             mBottomBar.findViewById(R.id.icon_picker).setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
-                    if (mBrowserType == MediaBrowserType.GRAVATAR_IMAGE_PICKER) {
+                    if (mBrowserType == MediaBrowserType.GRAVATAR_IMAGE_PICKER
+                        || mBrowserType == MediaBrowserType.SITE_ICON_PICKER) {
                         doIconClicked(PhotoPickerIcon.ANDROID_CHOOSE_PHOTO);
                     } else {
                         showPickerPopupMenu(v);
