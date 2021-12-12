diff --git a/cube/src/test/java/org/apache/kylin/cube/CubeSegmentsTest.java b/cube/src/test/java/org/apache/kylin/cube/CubeSegmentsTest.java
index a7dbb74..94d0925 100644
--- a/cube/src/test/java/org/apache/kylin/cube/CubeSegmentsTest.java
+++ b/cube/src/test/java/org/apache/kylin/cube/CubeSegmentsTest.java
@@ -74,7 +74,7 @@
         assertEquals(2, cube.getSegments().size());
         
         // non-partitioned cannot merge, throw exception
-        mgr.mergeSegments(cube, 0, Long.MAX_VALUE);
+        mgr.mergeSegments(cube, 0, Long.MAX_VALUE, false);
     }
 
     @Test
@@ -99,7 +99,7 @@
         seg2.setStatus(SegmentStatusEnum.READY);
         
         // merge first and second
-        CubeSegment merge = mgr.mergeSegments(cube, 0, 2000);
+        CubeSegment merge = mgr.mergeSegments(cube, 0, 2000, false);
 
         assertEquals(3, cube.getSegments().size());
         assertEquals(0, merge.getDateRangeStart());
@@ -115,7 +115,7 @@
         cube.getSegments().remove(merge);
         
         // try merge at start/end at middle of segments
-        CubeSegment merge2 = mgr.mergeSegments(cube, 500, 1500);
+        CubeSegment merge2 = mgr.mergeSegments(cube, 500, 1500, false);
         assertEquals(3, cube.getSegments().size());
         assertEquals(0, merge2.getDateRangeStart());
         assertEquals(2000, merge2.getDateRangeEnd());
