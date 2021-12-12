diff --git a/src/main/java/tachyon/client/TachyonClient.java b/src/main/java/tachyon/client/TachyonClient.java
index e6f87b8..c22b10f 100644
--- a/src/main/java/tachyon/client/TachyonClient.java
+++ b/src/main/java/tachyon/client/TachyonClient.java
@@ -79,7 +79,7 @@
     LOG.error("TachyonClient accessLocalFile(" + fileId + ") failed");
   }
 
-  public void addCheckpoint(int fileId) 
+  public synchronized void addCheckpoint(int fileId) 
       throws FileDoesNotExistException, SuspectedFileSizeException, FailedToCheckpointException {
     connectAndGetLocalWorker();
     if (!mConnected) {
@@ -95,7 +95,8 @@
     }
   }
 
-  public void cacheFile(int fileId) throws FileDoesNotExistException, SuspectedFileSizeException {
+  public synchronized void cacheFile(int fileId) 
+      throws FileDoesNotExistException, SuspectedFileSizeException {
     connectAndGetLocalWorker();
     if (!mConnected) {
       return;
