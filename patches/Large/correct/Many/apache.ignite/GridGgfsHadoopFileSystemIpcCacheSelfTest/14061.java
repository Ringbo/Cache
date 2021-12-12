diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemIpcCacheSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemIpcCacheSelfTest.java
index 3b05ae8..cf6f0c4 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemIpcCacheSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemIpcCacheSelfTest.java
@@ -65,7 +65,7 @@
         ggfsCfg.setName("ggfs");
         ggfsCfg.setManagementPort(GridGgfsConfiguration.DFLT_MGMT_PORT + cnt);
 
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(
             "{type:'shmem', port:" + (GridIpcSharedMemoryServerEndpoint.DFLT_IPC_PORT +cnt) + "}"));
 
         ggfsCfg.setBlockSize(512 * 1024); // Together with group blocks mapper will yield 64M per node groups.
