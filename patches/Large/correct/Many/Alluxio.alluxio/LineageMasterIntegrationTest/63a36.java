diff --git a/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java b/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
index edf75e2..373d5f6 100644
--- a/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
@@ -146,7 +146,7 @@
 
       // worker notifies the master
       HeartbeatScheduler.schedule(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC);
-      Assert.assertTrue(HeartbeatScheduler.await(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC, 500,
+      Assert.assertTrue(HeartbeatScheduler.await(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC, 5,
           TimeUnit.SECONDS));
 
       fileInfo = getFileSystemMasterClient().getFileInfo(fileId);
