diff --git a/core/client/src/main/java/alluxio/client/block/RetryHandlingBlockWorkerClient.java b/core/client/src/main/java/alluxio/client/block/RetryHandlingBlockWorkerClient.java
index 7062e2a..1cdfda1 100644
--- a/core/client/src/main/java/alluxio/client/block/RetryHandlingBlockWorkerClient.java
+++ b/core/client/src/main/java/alluxio/client/block/RetryHandlingBlockWorkerClient.java
@@ -258,7 +258,7 @@
       client.getOutputProtocol().getTransport().close();
       throw new IOException(e);
     } finally {
-      BlockStoreContext.releaseBlockWorkerThriftClient(mRpcAddress, client);
+      BlockStoreContext.releaseBlockWorkerThriftClientHeartbeat(mRpcAddress, client);
     }
   }
 
