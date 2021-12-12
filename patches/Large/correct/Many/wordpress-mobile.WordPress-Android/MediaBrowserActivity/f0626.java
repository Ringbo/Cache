diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
index 9d237a8..cec1c8e 100755
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
@@ -1089,7 +1089,7 @@
     public void onEventMainThread(UploadService.UploadMediaSuccessEvent event) {
         if (event.mediaModelList != null && !event.mediaModelList.isEmpty()) {
             UploadUtils.onMediaUploadedSnackbarHandler(this,
-                    findViewById(R.id.tab_layout), true,
+                    findViewById(R.id.tab_layout), false,
                     event.mediaModelList, event.successMessage);
         }
     }
