diff --git a/src/main/java/tachyon/MasterClient.java b/src/main/java/tachyon/MasterClient.java
index ff8469d..7f153eb 100644
--- a/src/main/java/tachyon/MasterClient.java
+++ b/src/main/java/tachyon/MasterClient.java
@@ -106,12 +106,12 @@
     CLIENT.user_deleteById(fileId);
   }
 
-  public ClientFileInfo user_getClientFileInfoByPath(String path)
+  public synchronized ClientFileInfo user_getClientFileInfoByPath(String path)
       throws FileDoesNotExistException, InvalidPathException, TException {
     return CLIENT.user_getClientFileInfoByPath(path);
   }
 
-  public ClientFileInfo user_getClientFileInfoById(int id)
+  public synchronized ClientFileInfo user_getClientFileInfoById(int id)
       throws FileDoesNotExistException, TException {
     return CLIENT.user_getClientFileInfoById(id);
   }
@@ -149,7 +149,7 @@
     return CLIENT.user_getNumberOfFiles(folderPath);
   }
 
-  public int user_mkdir(String path) 
+  public synchronized int user_mkdir(String path) 
       throws FileAlreadyExistException, InvalidPathException, TException {
     return CLIENT.user_mkdir(path);
   }
@@ -167,13 +167,13 @@
     CLIENT.user_unpinFile(id);
   }
 
-  public void worker_addCheckpoint(long workerId, int fileId, long fileSizeBytes, 
+  public synchronized void worker_addCheckpoint(long workerId, int fileId, long fileSizeBytes, 
       String checkpointPath) 
           throws FileDoesNotExistException, SuspectedFileSizeException, TException {
     CLIENT.worker_addCheckpoint(workerId, fileId, fileSizeBytes, checkpointPath);
   }
 
-  public void worker_cachedFile(long workerId, long workerUsedBytes, int fileId, 
+  public synchronized void worker_cachedFile(long workerId, long workerUsedBytes, int fileId, 
       long fileSizeBytes) throws FileDoesNotExistException, SuspectedFileSizeException, TException {
     CLIENT.worker_cacheFile(workerId, workerUsedBytes, fileId, fileSizeBytes);
   }
