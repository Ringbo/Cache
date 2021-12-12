diff --git a/library/src/com/google/maps/android/geometry/Bounds.java b/library/src/com/google/maps/android/geometry/Bounds.java
index 4041b03..e08bc38 100644
--- a/library/src/com/google/maps/android/geometry/Bounds.java
+++ b/library/src/com/google/maps/android/geometry/Bounds.java
@@ -36,7 +36,7 @@
         this.maxY = maxY;
 
         midX = (minX + maxX) / 2;
-        midY = (minY + minY) / 2;
+        midY = (minY + maxY) / 2;
     }
 
     public boolean contains(double x, double y) {
