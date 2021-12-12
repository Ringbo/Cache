diff --git a/processing/src/test/java/io/druid/segment/filter/SpatialFilterBonusTest.java b/processing/src/test/java/io/druid/segment/filter/SpatialFilterBonusTest.java
index 8e423df..0eb3279 100644
--- a/processing/src/test/java/io/druid/segment/filter/SpatialFilterBonusTest.java
+++ b/processing/src/test/java/io/druid/segment/filter/SpatialFilterBonusTest.java
@@ -83,7 +83,7 @@
     return Arrays.asList(
         new Object[][]{
             {
-                new IncrementalIndexSegment(rtIndex)
+                new IncrementalIndexSegment(rtIndex, null)
             },
             {
                 new QueryableIndexSegment(null, mMappedTestIndex)
