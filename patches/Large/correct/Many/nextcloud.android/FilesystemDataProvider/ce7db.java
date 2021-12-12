diff --git a/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java b/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
index 7937cea..f1cf283 100644
--- a/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
+++ b/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
@@ -139,7 +139,7 @@
 
             if (data.getModifiedAt() != modifiedAt) {
                 long newCrc32 = getFileChecksum(localPath);
-                if (data.getCrc32() == null || (newCrc32 != -1 && data.getCrc32().equals(Long.toString(newCrc32)))) {
+                if (data.getCrc32() == null || (newCrc32 != -1 && !data.getCrc32().equals(Long.toString(newCrc32)))) {
                     cv.put(ProviderMeta.ProviderTableMeta.FILESYSTEM_CRC32, Long.toString(newCrc32));
                     cv.put(ProviderMeta.ProviderTableMeta.FILESYSTEM_FILE_SENT_FOR_UPLOAD, 0);
                 }
