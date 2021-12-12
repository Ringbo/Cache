diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistComponentsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistComponentsStepTest.java
index 094c7fd..cf11bca 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistComponentsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistComponentsStepTest.java
@@ -103,7 +103,7 @@
   }
 
   @Test
-  public void persist_components() throws Exception {
+  public void persist_components() {
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
       .setType(Constants.ComponentType.PROJECT)
@@ -209,7 +209,7 @@
   }
 
   @Test
-  public void persist_file_directly_attached_on_root_directory() throws Exception {
+  public void persist_file_directly_attached_on_root_directory() {
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
       .setType(Constants.ComponentType.PROJECT)
@@ -249,7 +249,7 @@
   }
 
   @Test
-  public void persist_unit_test() throws Exception {
+  public void persist_unit_test() {
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
       .setType(Constants.ComponentType.PROJECT)
@@ -287,7 +287,7 @@
   }
 
   @Test
-  public void persist_only_new_components() throws Exception {
+  public void persist_only_new_components() {
     // Project amd module already exists
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, project);
@@ -361,7 +361,7 @@
   }
 
   @Test
-  public void compute_parent_project_id() throws Exception {
+  public void compute_parent_project_id() {
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
       .setType(Constants.ComponentType.PROJECT)
@@ -432,7 +432,7 @@
   }
 
   @Test
-  public void persist_multi_modules() throws Exception {
+  public void persist_multi_modules() {
     reportReader.putComponent(BatchReport.Component.newBuilder()
       .setRef(1)
       .setType(Constants.ComponentType.PROJECT)
@@ -497,7 +497,7 @@
   }
 
   @Test
-  public void nothing_to_persist() throws Exception {
+  public void nothing_to_persist() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, project);
     ComponentDto module = ComponentTesting.newModuleDto("BCDE", project).setKey("MODULE_KEY").setName("Module");
@@ -587,7 +587,7 @@
   }
 
   @Test
-  public void update_module_name() throws Exception {
+  public void update_module_name() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, project);
     ComponentDto module = ComponentTesting.newModuleDto("BCDE", project).setKey("MODULE_KEY").setName("Module").setPath("path");
@@ -623,7 +623,7 @@
   }
 
   @Test
-  public void update_module_description() throws Exception {
+  public void update_module_description() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project").setDescription("Project description");
     dbClient.componentDao().insert(session, project);
     ComponentDto module = ComponentTesting.newModuleDto("BCDE", project).setKey("MODULE_KEY").setName("Module");
@@ -660,7 +660,7 @@
   }
 
   @Test
-  public void update_module_path() throws Exception {
+  public void update_module_path() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, project);
     ComponentDto module = ComponentTesting.newModuleDto("BCDE", project).setKey("MODULE_KEY").setName("Module").setPath("path");
@@ -693,7 +693,7 @@
   }
 
   @Test
-  public void update_module_uuid_when_moving_a_module() throws Exception {
+  public void update_module_uuid_when_moving_a_module() {
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project");
     dbClient.componentDao().insert(session, project);
     ComponentDto moduleA = ComponentTesting.newModuleDto("EDCB", project).setKey("MODULE_A").setName("Module A");
@@ -781,7 +781,7 @@
   }
 
   @Test
-  public void do_not_update_created_at_on_existing_component() throws Exception {
+  public void do_not_update_created_at_on_existing_component() {
     Date oldDate = DateUtils.parseDate("2015-01-01");
     ComponentDto project = ComponentTesting.newProjectDto("ABCD").setKey(PROJECT_KEY).setName("Project").setCreatedAt(oldDate);
     dbClient.componentDao().insert(session, project);
