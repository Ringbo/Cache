diff --git a/clients/unshaded/src/main/java/tachyon/client/file/FileSystemContext.java b/clients/unshaded/src/main/java/tachyon/client/file/FileSystemContext.java
index 3127e70..b01cadf 100644
--- a/clients/unshaded/src/main/java/tachyon/client/file/FileSystemContext.java
+++ b/clients/unshaded/src/main/java/tachyon/client/file/FileSystemContext.java
@@ -52,7 +52,7 @@
    *
    * @param masterClient a block master client to release
    */
-  public synchronized void releaseMasterClient(FileSystemMasterClient masterClient) {
+  public void releaseMasterClient(FileSystemMasterClient masterClient) {
     mFileSystemMasterClientPool.release(masterClient);
   }
 
