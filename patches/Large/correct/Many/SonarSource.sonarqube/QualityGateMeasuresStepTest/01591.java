diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateMeasuresStepTest.java
index a21099c..663be5b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateMeasuresStepTest.java
@@ -80,7 +80,7 @@
   private QualityGateMeasuresStep underTest = new QualityGateMeasuresStep(treeRootHolder, qualityGateHolder, measureRepository, metricRepository, resultTextConverter);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     treeRootHolder.setRoot(PROJECT_COMPONENT);
 
     when(metricRepository.getByKey(CoreMetrics.ALERT_STATUS_KEY)).thenReturn(ALERT_STATUS_METRIC);
