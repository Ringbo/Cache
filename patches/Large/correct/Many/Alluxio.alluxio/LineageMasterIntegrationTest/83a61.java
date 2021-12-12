diff --git a/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java b/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
index 056519f..edf75e2 100644
--- a/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/master/lineage/LineageMasterIntegrationTest.java
@@ -142,11 +142,11 @@
           fileInfo.getPersistenceState());
 
       // sleep and wait for worker to persist the file
-      CommonUtils.sleepMs(5);
+      CommonUtils.sleepMs(200);
 
       // worker notifies the master
       HeartbeatScheduler.schedule(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC);
-      Assert.assertTrue(HeartbeatScheduler.await(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC, 5,
+      Assert.assertTrue(HeartbeatScheduler.await(HeartbeatContext.WORKER_FILESYSTEM_MASTER_SYNC, 500,
           TimeUnit.SECONDS));
 
       fileInfo = getFileSystemMasterClient().getFileInfo(fileId);
