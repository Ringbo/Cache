diff --git a/server/sonar-server/src/test/java/org/sonar/server/source/index/SourceLineResultSetIteratorTest.java b/server/sonar-server/src/test/java/org/sonar/server/source/index/SourceLineResultSetIteratorTest.java
index 687ba83..dd7cdd1 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/source/index/SourceLineResultSetIteratorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/source/index/SourceLineResultSetIteratorTest.java
@@ -42,7 +42,7 @@
 
   SourceLineResultSetIterator iterator;
 
-  public void after() throws Exception {
+  public void after() {
     if (iterator != null) {
       iterator.close();
     }
