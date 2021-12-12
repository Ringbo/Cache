diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemAbstractSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemAbstractSelfTest.java
index 539e943..ffa69d5 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemAbstractSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemAbstractSelfTest.java
@@ -165,7 +165,7 @@
             ggfsCfg.setDataCacheName("partitioned");
             ggfsCfg.setMetaCacheName("replicated");
             ggfsCfg.setName("ggfs_secondary");
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(SECONDARY_ENDPOINT_CFG));
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(SECONDARY_ENDPOINT_CFG));
             ggfsCfg.setBlockSize(512 * 1024);
             ggfsCfg.setPrefetchBlocks(1);
 
@@ -320,7 +320,7 @@
 
         String x = primaryIpcEndpointConfiguration(gridName);
 
-        Map<String, String> endPointCfg = GridHadoopTestUtils.jsonToMap(x);
+        Map<String, String> endPointCfg = GridGgfsTestUtils.jsonToMap(x);
 
         cfg.setIpcEndpointConfiguration(endPointCfg);
 
