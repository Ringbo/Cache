diff --git a/job/src/test/java/org/apache/kylin/job/hadoop/cube/MergeCuboidMapperTest.java b/job/src/test/java/org/apache/kylin/job/hadoop/cube/MergeCuboidMapperTest.java
index b1d37bb..01e57d5 100644
--- a/job/src/test/java/org/apache/kylin/job/hadoop/cube/MergeCuboidMapperTest.java
+++ b/job/src/test/java/org/apache/kylin/job/hadoop/cube/MergeCuboidMapperTest.java
@@ -159,7 +159,7 @@
 
         //        String cubeName = "test_kylin_cube_without_slr_left_join_ready_2_segments";
 
-        CubeSegment newSeg = cubeManager.mergeSegments(cube, 0L, 1386835200000L);
+        CubeSegment newSeg = cubeManager.mergeSegments(cube, 0L, 1386835200000L, false);
         //        String segmentName = newSeg.getName();
 
         final Dictionary<?> dictionary = cubeManager.getDictionary(newSeg, lfn);
