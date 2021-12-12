diff --git a/hazelcast/src/test/java/com/hazelcast/cluster/SplitBrainHandlerTest.java b/hazelcast/src/test/java/com/hazelcast/cluster/SplitBrainHandlerTest.java
index 833bef6..b5e25ee 100644
--- a/hazelcast/src/test/java/com/hazelcast/cluster/SplitBrainHandlerTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cluster/SplitBrainHandlerTest.java
@@ -518,7 +518,7 @@
         closeConnectionBetween(data3, lite1);
 
         assertClusterSizeEventually(3, lite1, lite2, data1);
-        assertClusterSize(2, data2, data3);
+        assertClusterSizeEventually(2, data2, data3);
 
         data1.getMap("default").put(1, "cluster1");
         data3.getMap("default").put(1, "cluster2");
