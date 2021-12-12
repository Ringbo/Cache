diff --git a/sonar-db/src/test/java/org/sonar/db/component/ResourceIndexDaoTest.java b/sonar-db/src/test/java/org/sonar/db/component/ResourceIndexDaoTest.java
index 21c24b4..7ce29a6 100644
--- a/sonar-db/src/test/java/org/sonar/db/component/ResourceIndexDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/component/ResourceIndexDaoTest.java
@@ -33,7 +33,7 @@
   ResourceIndexDao dao = dbTester.getDbClient().componentIndexDao();
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
@@ -74,7 +74,7 @@
   }
 
   @Test
-  public void shouldNotIndexPackages() throws SQLException {
+  public void shouldNotIndexPackages() {
     setupData("shouldNotIndexPackages");
 
     dao.indexProject(1);
