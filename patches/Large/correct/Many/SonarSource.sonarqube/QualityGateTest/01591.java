diff --git a/it/it-tests/src/test/java/qualitygate/QualityGateTest.java b/it/it-tests/src/test/java/qualitygate/QualityGateTest.java
index e13f8bb..5f975e9 100644
--- a/it/it-tests/src/test/java/qualitygate/QualityGateTest.java
+++ b/it/it-tests/src/test/java/qualitygate/QualityGateTest.java
@@ -38,7 +38,7 @@
     .build();
 
   @Before
-  public void cleanUp() throws Exception {
+  public void cleanUp() {
     orchestrator.resetData();
     provisionnedProjectId = Long.parseLong(orchestrator.getServer().adminWsClient().projectClient().create(NewProject.create().key(PROJECT_KEY).name("Sample")).id());
   }
