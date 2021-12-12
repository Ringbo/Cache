diff --git a/cube/src/main/java/com/kylinolap/cube/CubeInstance.java b/cube/src/main/java/com/kylinolap/cube/CubeInstance.java
index 271a8e7..4294934 100644
--- a/cube/src/main/java/com/kylinolap/cube/CubeInstance.java
+++ b/cube/src/main/java/com/kylinolap/cube/CubeInstance.java
@@ -425,7 +425,7 @@
             return false;
         }
         for (CubeSegment readySegment: readySegments) {
-            if (readySegment.getDateRangeEnd() < segment.getDateRangeStart()) {
+            if (readySegment.getDateRangeEnd() > segment.getDateRangeStart()) {
                 //has overlap and not refresh
                 return true;
             }
