diff --git a/server/sonar-server/src/test/java/org/sonar/server/startup/RegisterMetricsTest.java b/server/sonar-server/src/test/java/org/sonar/server/startup/RegisterMetricsTest.java
index d59effa..803b960 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/startup/RegisterMetricsTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/startup/RegisterMetricsTest.java
@@ -113,7 +113,7 @@
   }
 
   @Test(expected = IllegalStateException.class)
-  public void fail_if_duplicated_plugin_metrics() throws Exception {
+  public void fail_if_duplicated_plugin_metrics() {
     Metrics plugin1 = new TestMetrics(new Metric.Builder("m1", "In first plugin", Metric.ValueType.FLOAT).create());
     Metrics plugin2 = new TestMetrics(new Metric.Builder("m1", "In second plugin", Metric.ValueType.FLOAT).create());
 
@@ -121,7 +121,7 @@
   }
 
   @Test(expected = IllegalStateException.class)
-  public void fail_if_plugin_duplicates_core_metric() throws Exception {
+  public void fail_if_plugin_duplicates_core_metric() {
     Metrics plugin = new TestMetrics(new Metric.Builder("ncloc", "In plugin", Metric.ValueType.FLOAT).create());
 
     new RegisterMetrics(dbClient(), new Metrics[]{plugin}).start();
