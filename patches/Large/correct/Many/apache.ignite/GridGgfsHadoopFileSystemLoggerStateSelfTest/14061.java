diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemLoggerStateSelfTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemLoggerStateSelfTest.java
index 9865b53..6de3338 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemLoggerStateSelfTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsHadoopFileSystemLoggerStateSelfTest.java
@@ -73,7 +73,7 @@
         ggfsCfg.setName("ggfs");
         ggfsCfg.setBlockSize(512 * 1024);
         ggfsCfg.setDefaultMode(PRIMARY);
-        ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:10500}"));
+        ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:10500}"));
 
         GridCacheConfiguration cacheCfg = defaultCacheConfiguration();
 
