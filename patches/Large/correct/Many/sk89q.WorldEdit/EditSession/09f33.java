diff --git a/src/main/java/com/sk89q/worldedit/EditSession.java b/src/main/java/com/sk89q/worldedit/EditSession.java
index 369f6cc..e9e6a2f 100644
--- a/src/main/java/com/sk89q/worldedit/EditSession.java
+++ b/src/main/java/com/sk89q/worldedit/EditSession.java
@@ -1489,7 +1489,7 @@
         for (int x = minX; x <= maxX; ++x) {
             for (int y = minY; y <= maxY; ++y) {
                 Vector minV = new Vector(x, y, minZ);
-                if (setBlock(min, pattern.next(minV))) {
+                if (setBlock(minV, pattern.next(minV))) {
                     ++affected;
                 }
                 Vector maxV = new Vector(x, y, maxZ);
