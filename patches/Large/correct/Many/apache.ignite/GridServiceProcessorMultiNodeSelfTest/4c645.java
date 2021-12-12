diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorMultiNodeSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorMultiNodeSelfTest.java
index 467974c..50f5999 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorMultiNodeSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorMultiNodeSelfTest.java
@@ -210,7 +210,7 @@
 
             IgniteServices svcs = g.services();
 
-            IgniteFuture<?> fut = svcs.deployAsync(name, new DummyService());
+            IgniteFuture<?> fut = svcs.deployAsync(srvcCfg);
 
             info("Deployed service: " + name);
 
