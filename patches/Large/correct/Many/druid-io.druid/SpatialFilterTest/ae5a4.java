diff --git a/processing/src/test/java/io/druid/segment/filter/SpatialFilterTest.java b/processing/src/test/java/io/druid/segment/filter/SpatialFilterTest.java
index b59d4a3..d342c12 100644
--- a/processing/src/test/java/io/druid/segment/filter/SpatialFilterTest.java
+++ b/processing/src/test/java/io/druid/segment/filter/SpatialFilterTest.java
@@ -83,7 +83,7 @@
     return Arrays.asList(
         new Object[][]{
             {
-                new IncrementalIndexSegment(rtIndex)
+                new IncrementalIndexSegment(rtIndex, null)
             },
             {
                 new QueryableIndexSegment(null, mMappedTestIndex)
