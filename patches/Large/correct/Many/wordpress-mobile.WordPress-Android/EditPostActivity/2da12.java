diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
index 4dd67dc..bbe0bc3 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -3327,7 +3327,7 @@
                 // passing false here as we need to keep the media item in case the user wants to undo
                 cancelMediaUpload(StringUtils.stringToInt(localMediaId), false);
             } else if (mShowGutenbergEditor) {
-                MediaModel mediaModel = mMediaStore.getMediaWithLocalId(StringUtils.stringToInt(mediaId));
+                MediaModel mediaModel = mMediaStore.getMediaWithLocalId(StringUtils.stringToInt(localMediaId));
                 if (mediaModel == null) {
                     return;
                 }
