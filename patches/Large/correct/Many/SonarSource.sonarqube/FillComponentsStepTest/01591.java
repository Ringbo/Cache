diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillComponentsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillComponentsStepTest.java
index 2679134..b8741e5 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillComponentsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FillComponentsStepTest.java
@@ -62,7 +62,7 @@
   FillComponentsStep sut;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     dbTester.truncateTables();
     session = dbTester.myBatis().openSession(false);
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new ComponentDao());
@@ -71,7 +71,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     MyBatis.closeQuietly(session);
   }
 
@@ -81,7 +81,7 @@
   }
 
   @Test
-  public void compute_keys_and_uuids() throws Exception {
+  public void compute_keys_and_uuids() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setRootComponentRef(1)
       .build());
@@ -129,7 +129,7 @@
   }
 
   @Test
-  public void return_existing_uuids() throws Exception {
+  public void return_existing_uuids() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY);
     dbClient.componentDao().insert(session, project);
     ComponentDto module = ComponentTesting.newModuleDto("BCDE", project).setKey("MODULE_KEY");
@@ -187,7 +187,7 @@
   }
 
   @Test
-  public void use_latest_module_for_files_key() throws Exception {
+  public void use_latest_module_for_files_key() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setRootComponentRef(1)
       .build());
@@ -235,7 +235,7 @@
   }
 
   @Test
-  public void use_branch_to_generate_keys() throws Exception {
+  public void use_branch_to_generate_keys() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setRootComponentRef(1)
       .setBranch("origin/master")
@@ -280,7 +280,7 @@
   }
 
   @Test
-  public void compute_keys_and_uuids_on_project_having_module_and_directory() throws Exception {
+  public void compute_keys_and_uuids_on_project_having_module_and_directory() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setRootComponentRef(1)
       .build());
@@ -346,7 +346,7 @@
   }
 
   @Test
-  public void compute_keys_and_uuids_on_multi_modules() throws Exception {
+  public void compute_keys_and_uuids_on_multi_modules() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setRootComponentRef(1)
       .build());
