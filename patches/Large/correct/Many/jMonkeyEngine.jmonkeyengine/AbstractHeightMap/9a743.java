diff --git a/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java b/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
index 5c56373..f701aa1 100644
--- a/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
+++ b/engine/src/terrain/com/jme3/terrain/heightmap/AbstractHeightMap.java
@@ -447,10 +447,10 @@
                 for (int d = 0; d < 8; d++) {
                     int i = x + dxs[d];
                     int j = y + dys[d];
-                    if (i < 0 || i > size) {
+                    if (i < 0 || i >= size) {
                         continue;
                     }
-                    if (j < 0 || j > size) {
+                    if (j < 0 || j >= size) {
                         continue;
                     }
                     neighNumber++;
