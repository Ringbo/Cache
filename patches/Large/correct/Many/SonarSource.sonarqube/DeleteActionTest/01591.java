diff --git a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DeleteActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DeleteActionTest.java
index 818a64a..45871fa 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DeleteActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DeleteActionTest.java
@@ -63,7 +63,7 @@
   MetricDao metricDao;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbClient = new DbClient(db.database(), db.myBatis(), new MetricDao(), new CustomMeasureDao());
     dbSession = dbClient.openSession(false);
     db.truncateTables();
@@ -73,7 +73,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
