diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ValidateProjectStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ValidateProjectStepTest.java
index dc96c34..ad75957 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ValidateProjectStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ValidateProjectStepTest.java
@@ -70,7 +70,7 @@
   ValidateProjectStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new ComponentDao(), new SnapshotDao());
     dbSession = dbClient.openSession(false);
@@ -80,12 +80,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
   @Test
-  public void not_fail_if_provisioning_enforced_and_project_exists() throws Exception {
+  public void not_fail_if_provisioning_enforced_and_project_exists() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder().setAnalysisDate(DEFAULT_ANALYSIS_TIME).build());
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
@@ -102,7 +102,7 @@
   }
 
   @Test
-  public void fail_if_provisioning_enforced_and_project_does_not_exists() throws Exception {
+  public void fail_if_provisioning_enforced_and_project_does_not_exists() {
     thrown.expect(MessageException.class);
     thrown.expectMessage("Unable to scan non-existing project '" + PROJECT_KEY + "'");
 
@@ -120,7 +120,7 @@
   }
 
   @Test
-  public void fail_if_provisioning_not_enforced_and_project_does_not_exists() throws Exception {
+  public void fail_if_provisioning_not_enforced_and_project_does_not_exists() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder().setAnalysisDate(DEFAULT_ANALYSIS_TIME).build());
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
@@ -135,7 +135,7 @@
   }
 
   @Test
-  public void not_fail_on_valid_branch() throws Exception {
+  public void not_fail_on_valid_branch() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setAnalysisDate(DEFAULT_ANALYSIS_TIME)
       .setBranch("origin/master")
@@ -151,7 +151,7 @@
   }
 
   @Test
-  public void fail_on_invalid_branch() throws Exception {
+  public void fail_on_invalid_branch() {
     thrown.expect(MessageException.class);
     thrown.expectMessage("Validation of project failed:\n" +
       "  o \"bran#ch\" is not a valid branch name. Allowed characters are alphanumeric, '-', '_', '.' and '/'.");
@@ -171,7 +171,7 @@
   }
 
   @Test
-  public void fail_on_invalid_key() throws Exception {
+  public void fail_on_invalid_key() {
     String invalidProjectKey = "Project\\Key";
 
     thrown.expect(MessageException.class);
@@ -199,7 +199,7 @@
   }
 
   @Test
-  public void fail_if_module_key_is_already_used_as_project_key() throws Exception {
+  public void fail_if_module_key_is_already_used_as_project_key() {
     thrown.expect(MessageException.class);
     thrown.expectMessage("Validation of project failed:\n" +
       "  o The project \"" + MODULE_KEY + "\" is already defined in SonarQube but not as a module of project \"" + PROJECT_KEY + "\". " +
@@ -231,7 +231,7 @@
   }
 
   @Test
-  public void fail_if_module_key_already_exists_in_another_project() throws Exception {
+  public void fail_if_module_key_already_exists_in_another_project() {
     String anotherProjectKey = "ANOTHER_PROJECT_KEY";
     thrown.expect(MessageException.class);
     thrown.expectMessage("Validation of project failed:\n" +
@@ -265,7 +265,7 @@
   }
 
   @Test
-  public void fail_if_project_key_already_exists_as_module() throws Exception {
+  public void fail_if_project_key_already_exists_as_module() {
     String anotherProjectKey = "ANOTHER_PROJECT_KEY";
     thrown.expect(MessageException.class);
     thrown.expectMessage("Validation of project failed:\n" +
@@ -300,7 +300,7 @@
   }
 
   @Test
-  public void not_fail_if_analysis_date_is_after_last_analysis() throws Exception {
+  public void not_fail_if_analysis_date_is_after_last_analysis() {
     reportReader.setMetadata(BatchReport.Metadata.newBuilder()
       .setAnalysisDate(DEFAULT_ANALYSIS_TIME) // 2015-06-01
       .build());
@@ -322,7 +322,7 @@
   }
 
   @Test
-  public void fail_if_analysis_date_is_before_last_analysis() throws Exception {
+  public void fail_if_analysis_date_is_before_last_analysis() {
     thrown.expect(MessageException.class);
     thrown.expectMessage("Validation of project failed:");
     thrown.expectMessage("Date of analysis cannot be older than the date of the last known analysis on this project. Value: ");
