diff --git a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
index 79185ab..54f2e9a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/uploads/PostUploadNotifier.java
@@ -330,7 +330,7 @@
         int postItemsNotUploaded = sNotificationData.totalPostItems > 0 ? sNotificationData.totalPostItems - (sNotificationData.currentPostItem-1) : 0;
         int mediaItemsNotUploaded = sNotificationData.totalMediaItems - sNotificationData.currentMediaItem;
         if (postItemsNotUploaded > 0) {
-            newErrorMessage += postItemsNotUploaded + " " + getPagesAndOrPostsString();
+            newErrorMessage += postItemsNotUploaded + " " + getPagesAndOrPostsString(postItemsNotUploaded);
             if (mediaItemsNotUploaded > 0) {
                 newErrorMessage += ", ";
             }
