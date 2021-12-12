diff --git a/core/common/src/test/java/alluxio/metrics/MetricsConfigTest.java b/core/common/src/test/java/alluxio/metrics/MetricsConfigTest.java
index eb9b663..293cabf 100644
--- a/core/common/src/test/java/alluxio/metrics/MetricsConfigTest.java
+++ b/core/common/src/test/java/alluxio/metrics/MetricsConfigTest.java
@@ -79,7 +79,7 @@
     MetricsConfig config = new MetricsConfig(mMetricsProps);
 
     Map<String, Properties> propertyCategories = config.getPropertyCategories();
-    Assert.assertEquals(2, propertyCategories.size());
+    Assert.assertEquals(3, propertyCategories.size());
 
     Properties masterProp = config.getInstanceProperties("master");
     Map<String, Properties> sourceProps =
