diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PurgeDatastoresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PurgeDatastoresStepTest.java
index e7850ac..1f40aa2 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PurgeDatastoresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PurgeDatastoresStepTest.java
@@ -63,12 +63,12 @@
   PurgeDatastoresStep sut = new PurgeDatastoresStep(mock(DbClient.class, Mockito.RETURNS_DEEP_STUBS), projectCleaner, dbIdsRepository, treeRootHolder, projectSettingsRepository);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     when(projectSettingsRepository.getProjectSettings(PROJECT_KEY)).thenReturn(new Settings());
   }
 
   @Test
-  public void call_purge_method_of_the_purge_task() throws IOException {
+  public void call_purge_method_of_the_purge_task() {
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("UUID-1234").setKey(PROJECT_KEY).build();
     treeRootHolder.setRoot(project);
     dbIdsRepository.setComponentId(project, 123L);
