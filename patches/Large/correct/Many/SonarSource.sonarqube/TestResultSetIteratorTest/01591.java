diff --git a/server/sonar-server/src/test/java/org/sonar/server/test/index/TestResultSetIteratorTest.java b/server/sonar-server/src/test/java/org/sonar/server/test/index/TestResultSetIteratorTest.java
index fdee9c9..a2e851e 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/test/index/TestResultSetIteratorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/test/index/TestResultSetIteratorTest.java
@@ -50,7 +50,7 @@
   TestResultSetIterator sut;
 
   @After
-  public void after() throws Exception {
+  public void after() {
     if (sut != null) {
       sut.close();
     }
