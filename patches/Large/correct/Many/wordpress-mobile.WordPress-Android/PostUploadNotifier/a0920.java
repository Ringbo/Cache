diff --git a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
index 856d595..705ce76 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
@@ -335,10 +335,10 @@
 
         if (mediaItemsNotUploaded > 0) {
             newErrorMessage += String.format(mContext.getString(R.string.media_files_not_uploaded), mediaItemsNotUploaded);
-            if (mediaItemsNotUploaded < sNotificationData.currentMediaItem) {
+            if (mediaItemsNotUploaded <= sNotificationData.currentMediaItem) {
                 // some media items were uploaded successfully
                 newErrorMessage += " " + String.format(mContext.getString(R.string.media_files_uploaded_succcessfully),
-                        (sNotificationData.currentMediaItem - mediaItemsNotUploaded));
+                        sNotificationData.currentMediaItem);
             }
         }
 
