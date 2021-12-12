diff --git a/library/src/test/java/com/liulishuo/filedownloader/download/DownloadRunnableTest.java b/library/src/test/java/com/liulishuo/filedownloader/download/DownloadRunnableTest.java
index 55077d4..a0de331 100644
--- a/library/src/test/java/com/liulishuo/filedownloader/download/DownloadRunnableTest.java
+++ b/library/src/test/java/com/liulishuo/filedownloader/download/DownloadRunnableTest.java
@@ -92,7 +92,7 @@
         }
 
         @Override
-        public void onCompleted(DownloadRunnable doneRunnable, long startOffset, long endOffset) throws IOException {
+        public void onCompleted(DownloadRunnable doneRunnable, long startOffset, long endOffset) {
         }
 
         boolean isFirstTime = true;
