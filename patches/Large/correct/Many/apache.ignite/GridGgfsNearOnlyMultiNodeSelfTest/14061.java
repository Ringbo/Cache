diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsNearOnlyMultiNodeSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsNearOnlyMultiNodeSelfTest.java
index 48f4bf6..0278134 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsNearOnlyMultiNodeSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsNearOnlyMultiNodeSelfTest.java
@@ -74,7 +74,7 @@
         ggfsCfg.setMetaCacheName("partitioned");
         ggfsCfg.setName("ggfs");
 
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(
             "{type:'shmem', port:" + (GridIpcSharedMemoryServerEndpoint.DFLT_IPC_PORT + cnt) + "}"));
 
         ggfsCfg.setBlockSize(512 * 1024); // Together with group blocks mapper will yield 64M per node groups.
