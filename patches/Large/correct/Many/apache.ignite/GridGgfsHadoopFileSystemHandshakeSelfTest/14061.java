diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemHandshakeSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemHandshakeSelfTest.java
index 3d84936..2376bfb 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemHandshakeSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemHandshakeSelfTest.java
@@ -224,7 +224,7 @@
         ggfsCfg.setName(dfltGgfsName ? null : GGFS_NAME);
         ggfsCfg.setPrefetchBlocks(1);
         ggfsCfg.setDefaultMode(PRIMARY);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:" + DFLT_IPC_PORT + "}"));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:" + DFLT_IPC_PORT + "}"));
         ggfsCfg.setManagementPort(-1);
         ggfsCfg.setBlockSize(512 * 1024);
 
