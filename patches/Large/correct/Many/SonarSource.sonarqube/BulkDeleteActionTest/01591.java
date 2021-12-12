diff --git a/server/sonar-server/src/test/java/org/sonar/server/project/ws/BulkDeleteActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/project/ws/BulkDeleteActionTest.java
index a93ed16..90b55c6 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/project/ws/BulkDeleteActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/project/ws/BulkDeleteActionTest.java
@@ -96,7 +96,7 @@
   ResourceType resourceType;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     ComponentDao componentDao = new ComponentDao();
     ResourceDao resourceDao = new ResourceDao(db.myBatis(), System2.INSTANCE);
     PurgeDao purgeDao = new PurgeDao(db.myBatis(), resourceDao, System2.INSTANCE);
@@ -114,7 +114,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
