diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistDuplicationsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistDuplicationsStepTest.java
index da3701f..4356f08 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistDuplicationsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistDuplicationsStepTest.java
@@ -68,7 +68,7 @@
   PersistDuplicationsStep sut;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     dbTester.truncateTables();
     session = dbTester.myBatis().openSession(false);
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new MeasureDao(), new MetricDao());
@@ -128,7 +128,7 @@
   }
 
   @Test
-  public void persist_duplications_on_same_file_linked_on_a_module() throws Exception {
+  public void persist_duplications_on_same_file_linked_on_a_module() {
     Component file = DumbComponent.builder(Component.Type.FILE, 3).setUuid("CDEF").setKey("MODULE_KEY:file").build();
     Component module = DumbComponent.builder(Component.Type.MODULE, 2).setUuid("BCDE").setKey("MODULE_KEY").addChildren(file).build();
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").setKey(PROJECT_KEY).addChildren(module).build();
