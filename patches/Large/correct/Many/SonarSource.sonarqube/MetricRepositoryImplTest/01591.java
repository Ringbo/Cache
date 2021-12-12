diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/metric/MetricRepositoryImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/metric/MetricRepositoryImplTest.java
index 337ee77..424a7b9 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/metric/MetricRepositoryImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/metric/MetricRepositoryImplTest.java
@@ -45,7 +45,7 @@
   private MetricRepositoryImpl underTest = new MetricRepositoryImpl(dbClient);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
