diff --git a/server/sonar-server/src/test/java/org/sonar/server/measure/custom/ws/UpdateActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/measure/custom/ws/UpdateActionTest.java
index 6f8e751..15a6671 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/measure/custom/ws/UpdateActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/measure/custom/ws/UpdateActionTest.java
@@ -91,7 +91,7 @@
   }
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbClient = new DbClient(db.database(), db.myBatis(), new CustomMeasureDao(), new ComponentDao(), new MetricDao());
     dbSession = dbClient.openSession(false);
     db.truncateTables();
