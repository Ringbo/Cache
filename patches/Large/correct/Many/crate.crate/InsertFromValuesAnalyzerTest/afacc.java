diff --git a/sql/src/test/java/io/crate/analyze/InsertFromValuesAnalyzerTest.java b/sql/src/test/java/io/crate/analyze/InsertFromValuesAnalyzerTest.java
index 06e8cb8..a43ff39 100644
--- a/sql/src/test/java/io/crate/analyze/InsertFromValuesAnalyzerTest.java
+++ b/sql/src/test/java/io/crate/analyze/InsertFromValuesAnalyzerTest.java
@@ -343,7 +343,7 @@
 
     @Test
     public void testInsertNestedObjectLiteral() throws Exception {
-        InsertAnalysis analysis = (InsertAnalysis) analyze(
+        InsertFromValuesAnalysis analysis = (InsertFromValuesAnalysis) analyze(
                 "insert into deeply_nested (tags) " +
                         "values ([" +
                         "           {\"name\"='cool', \"metadata\"=[{\"id\"=0}, {\"id\"=1}]}, " +
