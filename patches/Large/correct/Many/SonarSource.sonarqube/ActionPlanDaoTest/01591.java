diff --git a/sonar-db/src/test/java/org/sonar/db/issue/ActionPlanDaoTest.java b/sonar-db/src/test/java/org/sonar/db/issue/ActionPlanDaoTest.java
index 533c06b..7764675 100644
--- a/sonar-db/src/test/java/org/sonar/db/issue/ActionPlanDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/issue/ActionPlanDaoTest.java
@@ -34,7 +34,7 @@
   ActionPlanDao dao = dbTester.getDbClient().actionPlanDao();
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
