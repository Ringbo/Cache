diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorAbstractSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorAbstractSelfTest.java
index 5671d84..b9076b9 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorAbstractSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/service/GridServiceProcessorAbstractSelfTest.java
@@ -134,7 +134,7 @@
         startExtraNodes(servers);
 
         for (int i = 0; i < clients; i++) {
-            final String nodeName = getTestGridName(nodeCount() + servers + i);
+            final String nodeName = getTestIgniteInstanceName(nodeCount() + servers + i);
 
             startGrid(nodeName, getConfiguration(nodeName).setClientMode(true));
         }
