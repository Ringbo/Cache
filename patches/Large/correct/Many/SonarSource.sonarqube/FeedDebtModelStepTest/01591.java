diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedDebtModelStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedDebtModelStepTest.java
index 996fd88..8c13d09 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedDebtModelStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedDebtModelStepTest.java
@@ -51,7 +51,7 @@
   FeedDebtModelStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new CharacteristicDao(dbTester.myBatis()));
     dbSession = dbClient.openSession(false);
@@ -60,7 +60,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
@@ -70,7 +70,7 @@
   }
 
   @Test
-  public void feed_characteristics() throws Exception {
+  public void feed_characteristics() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     sut.execute();
