diff --git a/sonar-plugin-api/src/test/java/org/sonar/api/resources/CoreMetricsTest.java b/sonar-plugin-api/src/test/java/org/sonar/api/resources/CoreMetricsTest.java
index 086005b..e004ec2 100644
--- a/sonar-plugin-api/src/test/java/org/sonar/api/resources/CoreMetricsTest.java
+++ b/sonar-plugin-api/src/test/java/org/sonar/api/resources/CoreMetricsTest.java
@@ -32,7 +32,7 @@
   @Test
   public void read_metrics_from_class_reflection() {
     List<Metric> metrics = CoreMetrics.getMetrics();
-    assertThat(metrics).hasSize(152);
+    assertThat(metrics).hasSize(151);
     assertThat(metrics).contains(CoreMetrics.NCLOC, CoreMetrics.DIRECTORIES);
   }
 
