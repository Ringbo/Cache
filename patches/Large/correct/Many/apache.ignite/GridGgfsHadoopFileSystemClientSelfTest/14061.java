diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemClientSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemClientSelfTest.java
index e72c428..e065129 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemClientSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemClientSelfTest.java
@@ -65,7 +65,7 @@
         ggfsCfg.setMetaCacheName("replicated");
         ggfsCfg.setName("ggfs");
         ggfsCfg.setBlockSize(512 * 1024);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:" + DFLT_IPC_PORT + '}'));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:" + DFLT_IPC_PORT + '}'));
 
         cfg.setCacheConfiguration(cacheConfiguration());
         cfg.setGgfsConfiguration(ggfsCfg);
