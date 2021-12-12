diff --git a/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java b/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
index 48f69f8..05b1ed6 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/download/FetchDataTask.java
@@ -91,9 +91,9 @@
         if (this.contentLength > 0 && contentLength != this.contentLength) {
             final String range;
             if (endOffset == 0) {
-                range = FileDownloadUtils.formatString("range[%d-)", startOffset);
+                range = FileDownloadUtils.formatString("range[%d-)", currentOffset);
             } else {
-                range = FileDownloadUtils.formatString("range[%d-%d)", startOffset, endOffset);
+                range = FileDownloadUtils.formatString("range[%d-%d)", currentOffset, endOffset);
             }
             throw new FileDownloadGiveUpRetryException(FileDownloadUtils.
                     formatString("require %s with contentLength(%d), but the " +
