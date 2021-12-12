diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillMeasuresWithVariationsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillMeasuresWithVariationsStepTest.java
index b5bb0dc..ee2d543 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillMeasuresWithVariationsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillMeasuresWithVariationsStepTest.java
@@ -100,7 +100,7 @@
   FillMeasuresWithVariationsStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
     session = dbTester.myBatis().openSession(false);
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new ComponentDao(), new SnapshotDao(), new MetricDao(), new MeasureDao(), new RuleDao(System2.INSTANCE),
@@ -118,12 +118,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     session.close();
   }
 
   @Test
-  public void do_nothing_when_no_raw_measure() throws Exception {
+  public void do_nothing_when_no_raw_measure() {
     SnapshotDto period1ProjectSnapshot = createForProject(PROJECT_DTO);
     dbClient.snapshotDao().insert(session, period1ProjectSnapshot);
     dbClient.measureDao().insert(session, newMeasureDto(ISSUES_METRIC.getId(), PROJECT_DTO.getId(), period1ProjectSnapshot.getId(), 60d));
@@ -139,7 +139,7 @@
   }
 
   @Test
-  public void do_nothing_when_no_period() throws Exception {
+  public void do_nothing_when_no_period() {
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid(PROJECT_DTO.uuid()).build();
     treeRootHolder.setRoot(project);
     periodsHolder.setPeriods();
@@ -150,7 +150,7 @@
   }
 
   @Test
-  public void set_variation() throws Exception {
+  public void set_variation() {
     // Project
     SnapshotDto period1ProjectSnapshot = createForProject(PROJECT_DTO);
     dbClient.snapshotDao().insert(session, period1ProjectSnapshot);
@@ -180,7 +180,7 @@
   }
 
   @Test
-  public void set_variations_on_all_periods() throws Exception {
+  public void set_variations_on_all_periods() {
     SnapshotDto period1ProjectSnapshot = createForProject(PROJECT_DTO).setLast(false);
     SnapshotDto period2ProjectSnapshot = createForProject(PROJECT_DTO).setLast(false);
     SnapshotDto period3ProjectSnapshot = createForProject(PROJECT_DTO).setLast(false);
@@ -220,7 +220,7 @@
   }
 
   @Test
-  public void set_variation_on_all_numeric_metrics() throws Exception {
+  public void set_variation_on_all_numeric_metrics() {
     SnapshotDto period1ProjectSnapshot = createForProject(PROJECT_DTO);
     dbClient.snapshotDao().insert(session, period1ProjectSnapshot);
     dbClient.measureDao().insert(session,
@@ -251,7 +251,7 @@
   }
 
   @Test
-  public void read_measure_from_batch() throws Exception {
+  public void read_measure_from_batch() {
     // Project
     SnapshotDto period1ProjectSnapshot = createForProject(PROJECT_DTO);
     dbClient.snapshotDao().insert(session, period1ProjectSnapshot);
