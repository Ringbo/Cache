diff --git a/sonar-db/src/test/java/org/sonar/db/source/FileSourceDaoTest.java b/sonar-db/src/test/java/org/sonar/db/source/FileSourceDaoTest.java
index 3704d37..384e11d 100644
--- a/sonar-db/src/test/java/org/sonar/db/source/FileSourceDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/source/FileSourceDaoTest.java
@@ -37,7 +37,7 @@
   FileSourceDao sut = dbTester.getDbClient().fileSourceDao();
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
