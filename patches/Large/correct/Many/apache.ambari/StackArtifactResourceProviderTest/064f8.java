diff --git a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/StackArtifactResourceProviderTest.java b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/StackArtifactResourceProviderTest.java
index f4c212c..af2cbc4 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/StackArtifactResourceProviderTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/StackArtifactResourceProviderTest.java
@@ -123,7 +123,7 @@
 
     Metric m1 = md.getMetrics().get("metrics/dfs/datanode/heartBeats_avg_time");
     Metric m2 = md.getMetrics().get("metrics/rpc/closeRegion_num_ops");
-    Assert.assertEquals(326, md.getMetrics().size());
+    Assert.assertEquals(1630, md.getMetrics().size());
     Assert.assertTrue(m1.isAmsHostMetric());
     Assert.assertEquals("unitless", m1.getUnit());
     Assert.assertFalse(m2.isAmsHostMetric());
