diff --git a/src/main/java/com/owncloud/android/ui/adapter/OCFileListAdapter.java b/src/main/java/com/owncloud/android/ui/adapter/OCFileListAdapter.java
index 3ccf79d..4156ae2 100644
--- a/src/main/java/com/owncloud/android/ui/adapter/OCFileListAdapter.java
+++ b/src/main/java/com/owncloud/android/ui/adapter/OCFileListAdapter.java
@@ -354,7 +354,7 @@
     private void setThumbnail(OCFile file, ImageView thumbnailView) {
         if (file.isFolder()) {
             thumbnailView.setImageDrawable(MimeTypeUtil.getFolderTypeIcon(file.isSharedWithMe() ||
-                    file.isSharedWithSharee(), file.isSharedViaLink(), file.isEncrypted()));
+                    file.isSharedWithSharee(), file.isSharedViaLink(), file.isEncrypted(), file.getMountType()));
         } else {
             if ((MimeTypeUtil.isImage(file) || MimeTypeUtil.isVideo(file)) && file.getRemoteId() != null) {
                 // Thumbnail in cache?
