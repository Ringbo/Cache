diff --git a/library/actor-common/src/main/java/im/actor/model/modules/file/DownloadTask.java b/library/actor-common/src/main/java/im/actor/model/modules/file/DownloadTask.java
index 0a27e7c..65b169b 100644
--- a/library/actor-common/src/main/java/im/actor/model/modules/file/DownloadTask.java
+++ b/library/actor-common/src/main/java/im/actor/model/modules/file/DownloadTask.java
@@ -189,7 +189,7 @@
     }
 
     private void downloadPart(final int blockIndex, final int fileOffset) {
-        downloaderProvider.downloadPart(fileUrl, fileOffset, blockSize, new FileDownloadCallback() {
+        downloaderProvider.downloadPart(fileUrl, fileOffset, blockSize, fileReference.getFileSize(), new FileDownloadCallback() {
             @Override
             public void onDownloaded(final byte[] data) {
                 self().send(new Runnable() {
