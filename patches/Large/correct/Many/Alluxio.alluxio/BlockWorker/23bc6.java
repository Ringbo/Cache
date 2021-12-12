diff --git a/servers/src/main/java/tachyon/worker/block/BlockWorker.java b/servers/src/main/java/tachyon/worker/block/BlockWorker.java
index ad4badb..76db868 100644
--- a/servers/src/main/java/tachyon/worker/block/BlockWorker.java
+++ b/servers/src/main/java/tachyon/worker/block/BlockWorker.java
@@ -117,7 +117,7 @@
     mThriftServer = createThriftServer();
     mWorkerNetAddress =
         new NetAddress(BlockWorkerUtils.getWorkerAddress(mTachyonConf).getAddress()
-            .getCanonicalHostName(), thriftServerPort, mDataServer.getPort());
+            .getHostAddress(), thriftServerPort, mDataServer.getPort());
 
     // Set up web server
     int webPort = mTachyonConf.getInt(Constants.WORKER_WEB_PORT, Constants.DEFAULT_WORKER_WEB_PORT);
