diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ProjectSettingsRepositoryTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ProjectSettingsRepositoryTest.java
index 4927cbe..c31e0ba 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ProjectSettingsRepositoryTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ProjectSettingsRepositoryTest.java
@@ -66,12 +66,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     session.close();
   }
 
   @Test
-  public void get_project_settings_from_global_settings() throws Exception {
+  public void get_project_settings_from_global_settings() {
     globalSettings.setProperty("key", "value");
 
     Settings settings = sut.getProjectSettings(PROJECT_KEY);
@@ -80,7 +80,7 @@
   }
 
   @Test
-  public void get_project_settings_from_db() throws Exception {
+  public void get_project_settings_from_db() {
     ComponentDto project = ComponentTesting.newProjectDto().setKey(PROJECT_KEY);
     dbClient.componentDao().insert(session, project);
     dbClient.propertiesDao().setProperty(new PropertyDto().setResourceId(project.getId()).setKey("key").setValue("value"), session);
@@ -92,7 +92,7 @@
   }
 
   @Test
-  public void call_twice_get_project_settings() throws Exception {
+  public void call_twice_get_project_settings() {
     globalSettings.setProperty("key", "value");
 
     Settings settings = sut.getProjectSettings(PROJECT_KEY);
