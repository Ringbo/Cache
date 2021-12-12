diff --git a/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeMapperTest.java b/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeMapperTest.java
index 97dec4e..031b1d8 100644
--- a/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeMapperTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeMapperTest.java
@@ -26,7 +26,7 @@
 public class IssueChangeMapperTest extends AbstractDaoTestCase {
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     dbTester.truncateTables();
   }
 
