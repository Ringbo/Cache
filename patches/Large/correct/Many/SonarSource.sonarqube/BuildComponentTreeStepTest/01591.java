diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/BuildComponentTreeStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/BuildComponentTreeStepTest.java
index a58e5db..f73fc13 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/BuildComponentTreeStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/BuildComponentTreeStepTest.java
@@ -52,7 +52,7 @@
   private BuildComponentTreeStep underTest = new BuildComponentTreeStep(reportReader, treeRootHolder);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     reportReader.setMetadata(Metadata.newBuilder().setRootComponentRef(ROOT_REF).build());
   }
 
