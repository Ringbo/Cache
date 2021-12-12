diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/SqaleMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/SqaleMeasuresStepTest.java
index 10a8e1c..10726ea 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/SqaleMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/SqaleMeasuresStepTest.java
@@ -74,7 +74,7 @@
   private SqaleMeasuresStep underTest = new SqaleMeasuresStep(treeRootHolder, metricRepository, measureRepository, sqaleRatingSettings);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     // assumes SQALE rating configuration is consistent
     when(sqaleRatingSettings.getRatingGrid()).thenReturn(RATING_GRID);
     when(sqaleRatingSettings.getSizeMetricKey(LANGUAGE_KEY_1)).thenReturn(METRIC_KEY_1);
