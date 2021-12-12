diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/activity/ActivityManagerTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/activity/ActivityManagerTest.java
index a10fd58..f580fd2 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/activity/ActivityManagerTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/activity/ActivityManagerTest.java
@@ -49,7 +49,7 @@
   ActivityManager underTest;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     dbTester.truncateTables();
     DbClient dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new ComponentDao());
 
@@ -57,7 +57,7 @@
   }
 
   @Test
-  public void process_existing_project() throws Exception {
+  public void process_existing_project() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     underTest.saveActivity(reportDto);
@@ -72,7 +72,7 @@
   }
 
   @Test
-  public void process_new_project() throws Exception {
+  public void process_new_project() {
     underTest.saveActivity(reportDto);
 
     // execute only the steps supporting the project qualifier
