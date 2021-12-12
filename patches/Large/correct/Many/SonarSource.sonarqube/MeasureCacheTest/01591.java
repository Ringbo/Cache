diff --git a/sonar-batch/src/test/java/org/sonar/batch/scan/measure/MeasureCacheTest.java b/sonar-batch/src/test/java/org/sonar/batch/scan/measure/MeasureCacheTest.java
index 505ee23..4e513e7 100644
--- a/sonar-batch/src/test/java/org/sonar/batch/scan/measure/MeasureCacheTest.java
+++ b/sonar-batch/src/test/java/org/sonar/batch/scan/measure/MeasureCacheTest.java
@@ -80,7 +80,7 @@
   }
 
   @Test
-  public void should_add_measure_with_big_data() throws InterruptedException {
+  public void should_add_measure_with_big_data() {
     Project p = new Project("struts");
 
     assertThat(measureCache.entries()).hasSize(0);
