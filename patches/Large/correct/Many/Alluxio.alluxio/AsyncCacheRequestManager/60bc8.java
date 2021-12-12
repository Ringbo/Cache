diff --git a/core/server/worker/src/main/java/alluxio/worker/block/AsyncCacheRequestManager.java b/core/server/worker/src/main/java/alluxio/worker/block/AsyncCacheRequestManager.java
index bdb4b48..e987537 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/AsyncCacheRequestManager.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/AsyncCacheRequestManager.java
@@ -50,6 +50,10 @@
   private final ConcurrentHashMap<Long, Protocol.AsyncCacheRequest> mPendingRequests;
   private final WorkerNetAddress mLocalWorkerAddress;
 
+  /**
+   * @param service thread pool to run the background caching work
+   * @param blockWorker handler to the block worker
+   */
   public AsyncCacheRequestManager(ExecutorService service, BlockWorker blockWorker) {
     mAsyncCacheExecutor = service;
     mBlockWorker = blockWorker;
@@ -78,7 +82,7 @@
       long sessionId = IdUtils.createSessionId();
       long blockSize = openUfsBlockOptions.getBlockSize();
       boolean isSourceLocal = mLocalWorkerAddress.getHost().equals(request.getSourceHost())
-          && mLocalWorkerAddress.getRpcPort() == request.getSourcePort();
+          && mLocalWorkerAddress.getDataPort() == request.getSourcePort();
       // Depends on the request, cache the target block from different sources
       try {
         if (isSourceLocal) {
