diff --git a/processing/src/test/java/io/druid/query/metadata/SegmentAnalyzerTest.java b/processing/src/test/java/io/druid/query/metadata/SegmentAnalyzerTest.java
index 55ed588..e1bc774 100644
--- a/processing/src/test/java/io/druid/query/metadata/SegmentAnalyzerTest.java
+++ b/processing/src/test/java/io/druid/query/metadata/SegmentAnalyzerTest.java
@@ -47,7 +47,7 @@
   public void testIncrementalDoesNotWork() throws Exception
   {
     final List<SegmentAnalysis> results = getSegmentAnalysises(
-        new IncrementalIndexSegment(TestIndex.getIncrementalTestIndex())
+        new IncrementalIndexSegment(TestIndex.getIncrementalTestIndex(), null)
     );
 
     Assert.assertEquals(0, results.size());
