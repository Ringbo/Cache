diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateEventsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateEventsStepTest.java
index 53b6051..dd2ddad 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateEventsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityGateEventsStepTest.java
@@ -74,7 +74,7 @@
   private QualityGateEventsStep underTest = new QualityGateEventsStep(treeRootHolder, metricRepository, measureRepository, eventRepository, notificationManager);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     when(metricRepository.getByKey(ALERT_STATUS_KEY)).thenReturn(alertStatusMetric);
     treeRootHolder.setRoot(PROJECT_COMPONENT);
   }
