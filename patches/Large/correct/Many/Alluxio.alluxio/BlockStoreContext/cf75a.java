diff --git a/clients/unshaded/src/main/java/tachyon/client/block/BlockStoreContext.java b/clients/unshaded/src/main/java/tachyon/client/block/BlockStoreContext.java
index af29c13..2ee6ca6 100644
--- a/clients/unshaded/src/main/java/tachyon/client/block/BlockStoreContext.java
+++ b/clients/unshaded/src/main/java/tachyon/client/block/BlockStoreContext.java
@@ -106,7 +106,7 @@
    *
    * @param masterClient a block master client to release
    */
-  public synchronized void releaseMasterClient(BlockMasterClient masterClient) {
+  public void releaseMasterClient(BlockMasterClient masterClient) {
     mBlockMasterClientPool.release(masterClient);
   }
 
@@ -193,7 +193,7 @@
    * @param workerClient the worker client to release, the client should not be accessed after this
    *        method is called
    */
-  public synchronized void releaseWorkerClient(WorkerClient workerClient) {
+  public void releaseWorkerClient(WorkerClient workerClient) {
     // If the client is local and the pool exists, release the client to the pool, otherwise just
     // close the client.
     if (workerClient.isLocal()) {
