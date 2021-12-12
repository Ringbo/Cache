diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistSnapshotsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistSnapshotsStepTest.java
index 93293f0..fdc3bc3 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistSnapshotsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistSnapshotsStepTest.java
@@ -86,7 +86,7 @@
   PersistSnapshotsStep sut;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     dbTester.truncateTables();
     session = dbTester.myBatis().openSession(false);
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new ComponentDao(), new SnapshotDao());
@@ -118,7 +118,7 @@
   }
 
   @Test
-  public void persist_snapshots() throws Exception {
+  public void persist_snapshots() {
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, projectDto);
     ComponentDto moduleDto = ComponentTesting.newModuleDto("BCDE", projectDto).setKey("MODULE_KEY").setName("Module");
@@ -211,7 +211,7 @@
   }
 
   @Test
-  public void persist_unit_test() throws Exception {
+  public void persist_unit_test() {
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, projectDto);
     ComponentDto moduleDto = ComponentTesting.newModuleDto("BCDE", projectDto).setKey("MODULE_KEY").setName("Module");
@@ -239,7 +239,7 @@
   }
 
   @Test
-  public void persist_snapshots_on_multi_modules() throws Exception {
+  public void persist_snapshots_on_multi_modules() {
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY);
     dbClient.componentDao().insert(session, projectDto);
     ComponentDto moduleADto = ComponentTesting.newModuleDto("BCDE", projectDto).setKey("MODULE_A");
@@ -295,7 +295,7 @@
   }
 
   @Test
-  public void persist_snapshots_with_periods() throws Exception {
+  public void persist_snapshots_with_periods() {
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, projectDto);
     SnapshotDto snapshotDto = SnapshotTesting.createForProject(projectDto).setCreatedAt(DateUtils.parseDateQuietly("2015-01-01").getTime());
@@ -316,7 +316,7 @@
   }
 
   @Test
-  public void only_persist_snapshots_with_periods_on_project_and_module() throws Exception {
+  public void only_persist_snapshots_with_periods_on_project_and_module() {
     periodsHolderRule.setPeriods(new Period(1, CoreProperties.TIMEMACHINE_MODE_PREVIOUS_ANALYSIS, null, analysisDate, 123L));
 
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
@@ -368,7 +368,7 @@
   }
 
   @Test
-  public void set_no_period_on_snapshots_when_no_period() throws Exception {
+  public void set_no_period_on_snapshots_when_no_period() {
     ComponentDto projectDto = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, projectDto);
     SnapshotDto snapshotDto = SnapshotTesting.createForProject(projectDto);
