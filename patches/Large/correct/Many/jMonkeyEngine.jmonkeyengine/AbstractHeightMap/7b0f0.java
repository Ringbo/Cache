diff --git a/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java b/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
index f701aa1..99be15b 100644
--- a/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
+++ b/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
@@ -184,7 +184,7 @@
 
         low = getScaledHeightAtPoint((int) x, (int) z);
 
-        if (x + 1 > size) {
+        if (x + 1 >= size) {
             return low;
         }
 
@@ -193,7 +193,7 @@
         interpolation = x - (int) x;
         intX = ((highX - low) * interpolation) + low;
 
-        if (z + 1 > size) {
+        if (z + 1 >= size) {
             return low;
         }
 
