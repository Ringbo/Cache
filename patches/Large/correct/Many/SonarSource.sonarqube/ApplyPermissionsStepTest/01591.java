diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ApplyPermissionsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ApplyPermissionsStepTest.java
index c6f6ac2..b7d36e4 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ApplyPermissionsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ApplyPermissionsStepTest.java
@@ -82,7 +82,7 @@
   ApplyPermissionsStep step;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
     esTester.truncateIndices();
 
@@ -103,12 +103,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
   @Test
-  public void grant_permission() throws Exception {
+  public void grant_permission() {
     ComponentDto projectDto = ComponentTesting.newProjectDto(PROJECT_UUID).setKey(PROJECT_KEY);
     dbClient.componentDao().insert(dbSession, projectDto);
 
@@ -136,7 +136,7 @@
   }
 
   @Test
-  public void nothing_to_do() throws Exception {
+  public void nothing_to_do() {
     long authorizationUpdatedAt = 1000L;
 
     ComponentDto projectDto = ComponentTesting.newProjectDto(PROJECT_UUID).setKey(PROJECT_KEY).setAuthorizationUpdatedAt(authorizationUpdatedAt);
