diff --git a/core/client/src/main/java/alluxio/client/file/FileSystemContext.java b/core/client/src/main/java/alluxio/client/file/FileSystemContext.java
index dafdf04..4db49ab 100644
--- a/core/client/src/main/java/alluxio/client/file/FileSystemContext.java
+++ b/core/client/src/main/java/alluxio/client/file/FileSystemContext.java
@@ -127,7 +127,7 @@
    *
    * @param subject the parent subject, set to null if not present
    */
-  private FileSystemContext(Subject subject) {
+  public FileSystemContext(Subject subject) {
     mParentSubject = subject;
     init();
   }
@@ -149,7 +149,7 @@
    * Closes all the resources asscoated with the context. Make sure all the resources are released
    * back to this context before calling this close. Usually, you don't need to call this.
    */
-  public synchronized void close() {
+  public void close() {
     mFileSystemMasterClientPool.close();
     mFileSystemMasterClientPool = null;
     mBlockMasterClientPool.close();
@@ -178,7 +178,7 @@
   /**
    * Resets the context.
    */
-  public synchronized void reset() {
+  public void reset() {
     close();
     init();
   }
