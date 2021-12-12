diff --git a/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java b/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
index d7da54a..a8306fa 100644
--- a/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
+++ b/src/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
@@ -239,7 +239,7 @@
 
                 @Override
                 public void onFailure(ApiHelper.ErrorType errorType, String errorMessage, Throwable throwable) {
-                    if (errorType == ApiHelper.ErrorType.NO_ERROR) {
+                    if (errorType != ApiHelper.ErrorType.NO_ERROR) {
                         String message = errorType == ApiHelper.ErrorType.NO_UPLOAD_FILES_CAP
                                 ? getString(R.string.media_error_no_permission)
                                 : getString(R.string.error_refresh_media);
