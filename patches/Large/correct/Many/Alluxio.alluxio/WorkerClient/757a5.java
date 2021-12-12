diff --git a/src/main/java/tachyon/WorkerClient.java b/src/main/java/tachyon/WorkerClient.java
index 9102085..23c3ef2 100644
--- a/src/main/java/tachyon/WorkerClient.java
+++ b/src/main/java/tachyon/WorkerClient.java
@@ -44,13 +44,13 @@
     CLIENT.accessFile(fileId);
   }
 
-  public void addCheckpoint(long userId, int fileId) 
+  public synchronized void addCheckpoint(long userId, int fileId) 
       throws FileDoesNotExistException, SuspectedFileSizeException,
       FailedToCheckpointException, TException {
     CLIENT.addCheckpoint(userId, fileId);
   }
 
-  public void cacheFile(long userId, int fileId)
+  public synchronized void cacheFile(long userId, int fileId)
       throws FileDoesNotExistException, SuspectedFileSizeException, TException {
     CLIENT.cacheFile(userId, fileId);
   }
