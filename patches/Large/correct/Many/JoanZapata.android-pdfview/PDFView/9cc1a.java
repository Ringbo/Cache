diff --git a/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java b/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
index 286c7db..5ffeef7 100644
--- a/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
+++ b/android-pdfview/src/main/java/com/joanzapata/pdfview/PDFView.java
@@ -236,7 +236,7 @@
         decodingAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
 
         renderingAsyncTask = new RenderingAsyncTask(this);
-        renderingAsyncTask.execute();
+        renderingAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
     }
 
     /**
