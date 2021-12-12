diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/IndexComponentsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/IndexComponentsStepTest.java
index 30a65ae..97fa809 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/IndexComponentsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/IndexComponentsStepTest.java
@@ -48,7 +48,7 @@
   IndexComponentsStep sut = new IndexComponentsStep(resourceIndexDao, dbIdsRepository, treeRootHolder);
 
   @Test
-  public void call_indexProject_of_dao() throws IOException {
+  public void call_indexProject_of_dao() {
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("PROJECT_UUID").setKey(PROJECT_KEY).build();
     dbIdsRepository.setComponentId(project, 123L);
     treeRootHolder.setRoot(project);
