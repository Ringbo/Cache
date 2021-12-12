diff --git a/sonar-db/src/test/java/org/sonar/db/notification/NotificationQueueDaoTest.java b/sonar-db/src/test/java/org/sonar/db/notification/NotificationQueueDaoTest.java
index 18f2132..1c0c41d 100644
--- a/sonar-db/src/test/java/org/sonar/db/notification/NotificationQueueDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/notification/NotificationQueueDaoTest.java
@@ -34,7 +34,7 @@
   NotificationQueueDao dao = new NotificationQueueDao(dbTester.myBatis());
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
