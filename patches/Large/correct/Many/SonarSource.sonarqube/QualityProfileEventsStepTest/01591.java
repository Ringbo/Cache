diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityProfileEventsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityProfileEventsStepTest.java
index a9e703e..72d9354 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityProfileEventsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/QualityProfileEventsStepTest.java
@@ -83,7 +83,7 @@
   private QualityProfileEventsStep underTest = new QualityProfileEventsStep(treeRootHolder, metricRepository, measureRepository, languageRepository, eventRepository);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     when(metricRepository.getByKey(CoreMetrics.QUALITY_PROFILES_KEY)).thenReturn(qualityProfileMetric);
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("uuid").setKey("key").build());
   }
