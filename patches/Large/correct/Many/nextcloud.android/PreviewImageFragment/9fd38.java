diff --git a/src/com/owncloud/android/ui/preview/PreviewImageFragment.java b/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
index df0fb7a..da5be22 100644
--- a/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
+++ b/src/com/owncloud/android/ui/preview/PreviewImageFragment.java
@@ -233,7 +233,7 @@
     public void onPrepareOptionsMenu(Menu menu) {
         super.onPrepareOptionsMenu(menu);
 
-        if (mContainerActivity.getStorageManager() != null) {
+        if (mContainerActivity.getStorageManager() != null && getFile() != null) {
             // Update the file
             setFile(mContainerActivity.getStorageManager().getFileById(getFile().getFileId()));
 
