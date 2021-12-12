diff --git a/core/server/src/main/java/alluxio/worker/netty/DataServerHandler.java b/core/server/src/main/java/alluxio/worker/netty/DataServerHandler.java
index 2f1dcac..31b5316 100644
--- a/core/server/src/main/java/alluxio/worker/netty/DataServerHandler.java
+++ b/core/server/src/main/java/alluxio/worker/netty/DataServerHandler.java
@@ -55,7 +55,7 @@
    * @param worker the Alluxio worker handle
    */
   public DataServerHandler(final AlluxioWorkerService worker) {
-    Preconditions.checkNotNull(worker);
+    Preconditions.checkNotNull(worker, "worker");
     mBlockHandler = new BlockDataServerHandler(worker.getBlockWorker());
     mUnderFileSystemHandler = new UnderFileSystemDataServerHandler(worker.getFileSystemWorker());
   }
