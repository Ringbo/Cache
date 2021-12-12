diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistTestsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistTestsStepTest.java
index 267bf5d..8a682e4 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistTestsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistTestsStepTest.java
@@ -86,7 +86,7 @@
   long now = 123456789L;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     db.truncateTables();
     session = db.myBatis().openSession(false);
     dbClient = new DbClient(db.database(), db.myBatis(), new FileSourceDao(db.myBatis()));
