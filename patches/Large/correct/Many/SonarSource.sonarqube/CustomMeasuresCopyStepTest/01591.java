diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/CustomMeasuresCopyStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/CustomMeasuresCopyStepTest.java
index 85a2807..8429381 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/CustomMeasuresCopyStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/CustomMeasuresCopyStepTest.java
@@ -65,13 +65,13 @@
   CustomMeasuresCopyStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     DbClient dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new CustomMeasureDao());
     sut = new CustomMeasuresCopyStep(treeRootHolder, dbClient, metricRepository, measureRepository);
   }
 
   @Test
-  public void copy_custom_measures() throws Exception {
+  public void copy_custom_measures() {
     dbTester.prepareDbUnit(getClass(), "custom-measures.xml");
 
     // custom metrics
