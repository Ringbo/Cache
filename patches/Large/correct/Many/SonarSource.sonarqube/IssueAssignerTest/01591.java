diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueAssignerTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueAssignerTest.java
index edc5a30..0a7d0f5 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueAssignerTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueAssignerTest.java
@@ -50,7 +50,7 @@
   IssueAssigner underTest;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     esTester.truncateIndices();
     underTest = new IssueAssigner(new SourceLineIndex(esTester.client()), reportReader, scmAccountToUser, defaultAssignee);
   }
