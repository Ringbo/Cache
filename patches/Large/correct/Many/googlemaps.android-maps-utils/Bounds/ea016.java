diff --git a/library/src/com/google/maps/android/geometry/Bounds.java b/library/src/com/google/maps/android/geometry/Bounds.java
old mode 100644
new mode 100755
index e08bc38..35b582b
--- a/library/src/com/google/maps/android/geometry/Bounds.java
+++ b/library/src/com/google/maps/android/geometry/Bounds.java
@@ -40,7 +40,7 @@
     }
 
     public boolean contains(double x, double y) {
-        return minX <= x && x < maxX && minY <= y && y < maxY;
+        return minX <= x && x <= maxX && minY <= y && y <= maxY;
     }
 
     public boolean contains(Point point) {
