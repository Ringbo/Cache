diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopDualAbstractSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopDualAbstractSelfTest.java
index d7a76ec..428db9a 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopDualAbstractSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopDualAbstractSelfTest.java
@@ -114,7 +114,7 @@
         ggfsCfg.setName(ggfsName);
         ggfsCfg.setBlockSize(GGFS_BLOCK_SIZE);
         ggfsCfg.setDefaultMode(mode);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(restCfg));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(restCfg));
         ggfsCfg.setSecondaryFileSystem(secondaryFs);
         ggfsCfg.setPrefetchBlocks(PREFETCH_BLOCKS);
         ggfsCfg.setSequentialReadsBeforePrefetch(SEQ_READS_BEFORE_PREFETCH);
