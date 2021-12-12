diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsEventsTestSuite.java b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsEventsTestSuite.java
index c88d9b9..fbe692f 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsEventsTestSuite.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/ggfs/GridGgfsEventsTestSuite.java
@@ -69,7 +69,7 @@
         @Override protected GridGgfsConfiguration getGgfsConfiguration() throws GridException {
             GridGgfsConfiguration ggfsCfg = super.getGgfsConfiguration();
 
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'shmem', port:" +
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'shmem', port:" +
                 (GridIpcSharedMemoryServerEndpoint.DFLT_IPC_PORT + 1) + "}"));
 
             return ggfsCfg;
@@ -84,7 +84,7 @@
         @Override protected GridGgfsConfiguration getGgfsConfiguration() throws GridException {
             GridGgfsConfiguration ggfsCfg = super.getGgfsConfiguration();
 
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:" +
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:" +
                 (GridIpcSharedMemoryServerEndpoint.DFLT_IPC_PORT + 1) + "}"));
 
             return ggfsCfg;
@@ -117,7 +117,7 @@
 
             ggfsCfg.setName("ggfs-secondary");
             ggfsCfg.setDefaultMode(PRIMARY);
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:11500}"));
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:11500}"));
 
             return ggfsCfg;
         }
@@ -211,7 +211,7 @@
 
             ggfsCfg.setName("ggfs-secondary");
             ggfsCfg.setDefaultMode(PRIMARY);
-            ggfsCfg.setIpcEndpointConfiguration(GridHadoopTestUtils.jsonToMap("{type:'tcp', port:11500}"));
+            ggfsCfg.setIpcEndpointConfiguration(GridGgfsTestUtils.jsonToMap("{type:'tcp', port:11500}"));
 
             return ggfsCfg;
         }
