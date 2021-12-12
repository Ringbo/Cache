diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoop20FileSystemAbstractSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoop20FileSystemAbstractSelfTest.java
index b590d7b..2b8396e 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoop20FileSystemAbstractSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoop20FileSystemAbstractSelfTest.java
@@ -139,7 +139,7 @@
             ggfsCfg.setDataCacheName("partitioned");
             ggfsCfg.setMetaCacheName("replicated");
             ggfsCfg.setName("ggfs_secondary");
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(secondaryIpcEndpointConfiguration()));
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(secondaryIpcEndpointConfiguration()));
             ggfsCfg.setManagementPort(-1);
             ggfsCfg.setBlockSize(512 * 1024);
             ggfsCfg.setPrefetchBlocks(1);
@@ -256,7 +256,7 @@
             cfg.setSecondaryFileSystem(new GridGgfsHadoopFileSystemWrapper(secondaryFileSystemUriPath(),
                 secondaryFileSystemConfigPath()));
 
-        cfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap(primaryIpcEndpointConfiguration(gridName)));
+        cfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap(primaryIpcEndpointConfiguration(gridName)));
         cfg.setManagementPort(-1);
 
         cfg.setBlockSize(512 * 1024); // Together with group blocks mapper will yield 64M per node groups.
