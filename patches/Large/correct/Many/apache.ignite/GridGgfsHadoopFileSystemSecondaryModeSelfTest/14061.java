diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemSecondaryModeSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemSecondaryModeSelfTest.java
index 6ac79df..e26f6f4 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemSecondaryModeSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemSecondaryModeSelfTest.java
@@ -84,7 +84,7 @@
         ggfsCfg.setBlockSize(512 * 1024);
         ggfsCfg.setDefaultMode(mode);
         ggfsCfg.setPathModes(pathModes);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:10500}"));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:10500}"));
         ggfsCfg.setManagementPort(-1);
         ggfsCfg.setSecondaryFileSystem(new GridGgfsHadoopFileSystemWrapper(
             "ggfs://ggfs-secondary:ggfs-grid-secondary@127.0.0.1:11500/",
@@ -147,7 +147,7 @@
         ggfsCfg.setName("ggfs-secondary");
         ggfsCfg.setBlockSize(512 * 1024);
         ggfsCfg.setDefaultMode(PRIMARY);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:11500}"));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:11500}"));
 
         GridCacheConfiguration cacheCfg = defaultCacheConfiguration();
 
