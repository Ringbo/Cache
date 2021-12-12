diff --git a/core/java/android/app/DownloadManager.java b/core/java/android/app/DownloadManager.java
index 0713127..93f732c 100644
--- a/core/java/android/app/DownloadManager.java
+++ b/core/java/android/app/DownloadManager.java
@@ -1155,7 +1155,7 @@
         validateArgumentIsNonEmpty("description", description);
         validateArgumentIsNonEmpty("path", path);
         validateArgumentIsNonEmpty("mimeType", mimeType);
-        if (length <= 0) {
+        if (length < 0) {
             throw new IllegalArgumentException(" invalid value for param: totalBytes");
         }
 
