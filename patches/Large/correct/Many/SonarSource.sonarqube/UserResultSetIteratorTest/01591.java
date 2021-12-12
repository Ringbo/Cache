diff --git a/server/sonar-server/src/test/java/org/sonar/server/user/index/UserResultSetIteratorTest.java b/server/sonar-server/src/test/java/org/sonar/server/user/index/UserResultSetIteratorTest.java
index d401c0d..5fb813b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/user/index/UserResultSetIteratorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/user/index/UserResultSetIteratorTest.java
@@ -39,7 +39,7 @@
   public DbTester dbTester = DbTester.create(System2.INSTANCE);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
