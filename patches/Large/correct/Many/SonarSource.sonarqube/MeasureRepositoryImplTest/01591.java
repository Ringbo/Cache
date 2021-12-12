diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureRepositoryImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureRepositoryImplTest.java
index 6906e2a..77257c5 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureRepositoryImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureRepositoryImplTest.java
@@ -101,7 +101,7 @@
   private DbSession dbSession;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     when(metric1.getKey()).thenReturn(METRIC_KEY_1);
     when(metric1.getType()).thenReturn(Metric.MetricType.STRING);
     when(metric2.getKey()).thenReturn(METRIC_KEY_2);
@@ -113,7 +113,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     if (dbSession != null) {
       dbSession.close();
     }
