diff --git a/core/server/src/main/java/alluxio/worker/file/FileSystemWorkerClientServiceHandler.java b/core/server/src/main/java/alluxio/worker/file/FileSystemWorkerClientServiceHandler.java
index 5d0c777..f69ed1d 100644
--- a/core/server/src/main/java/alluxio/worker/file/FileSystemWorkerClientServiceHandler.java
+++ b/core/server/src/main/java/alluxio/worker/file/FileSystemWorkerClientServiceHandler.java
@@ -49,7 +49,7 @@
    * @param worker the file system worker which will handle most of the requests
    */
   public FileSystemWorkerClientServiceHandler(FileSystemWorker worker) {
-    mWorker = Preconditions.checkNotNull(worker);
+    mWorker = Preconditions.checkNotNull(worker, "worker");
   }
 
   @Override
