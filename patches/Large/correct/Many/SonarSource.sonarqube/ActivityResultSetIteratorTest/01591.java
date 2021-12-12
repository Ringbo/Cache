diff --git a/server/sonar-server/src/test/java/org/sonar/server/activity/index/ActivityResultSetIteratorTest.java b/server/sonar-server/src/test/java/org/sonar/server/activity/index/ActivityResultSetIteratorTest.java
index d464a49..b84d328 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/activity/index/ActivityResultSetIteratorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/activity/index/ActivityResultSetIteratorTest.java
@@ -40,7 +40,7 @@
   public DbTester dbTester = DbTester.create(System2.INSTANCE);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
