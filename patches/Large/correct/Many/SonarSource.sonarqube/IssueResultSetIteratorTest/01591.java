diff --git a/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueResultSetIteratorTest.java b/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueResultSetIteratorTest.java
index a8947c3..9ecc768 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueResultSetIteratorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueResultSetIteratorTest.java
@@ -40,7 +40,7 @@
   public DbTester dbTester = DbTester.create(System2.INSTANCE);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
