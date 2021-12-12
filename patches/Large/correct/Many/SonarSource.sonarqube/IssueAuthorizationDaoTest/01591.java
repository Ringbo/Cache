diff --git a/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueAuthorizationDaoTest.java b/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueAuthorizationDaoTest.java
index bd2e691..ee3ffdc 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueAuthorizationDaoTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/issue/index/IssueAuthorizationDaoTest.java
@@ -41,7 +41,7 @@
   IssueAuthorizationDao dao = new IssueAuthorizationDao();
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
