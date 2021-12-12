diff --git a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DomainsActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DomainsActionTest.java
index ffd053b..22a0469 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DomainsActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/DomainsActionTest.java
@@ -46,14 +46,14 @@
   DbSession dbSession;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbClient = new DbClient(db.database(), db.myBatis(), new MetricDao());
     dbSession = dbClient.openSession(false);
     ws = new WsTester(new MetricsWs(new DomainsAction(dbClient)));
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
