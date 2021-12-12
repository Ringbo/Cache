diff --git a/processing/src/test/java/io/druid/query/QueryRunnerTestHelper.java b/processing/src/test/java/io/druid/query/QueryRunnerTestHelper.java
index 58c1e97..747ab09 100644
--- a/processing/src/test/java/io/druid/query/QueryRunnerTestHelper.java
+++ b/processing/src/test/java/io/druid/query/QueryRunnerTestHelper.java
@@ -110,7 +110,7 @@
     return Arrays.asList(
         new Object[][]{
             {
-                makeQueryRunner(factory, new IncrementalIndexSegment(rtIndex))
+                makeQueryRunner(factory, new IncrementalIndexSegment(rtIndex, null))
             },
             {
                 makeQueryRunner(factory, new QueryableIndexSegment(null, mMappedTestIndex))
