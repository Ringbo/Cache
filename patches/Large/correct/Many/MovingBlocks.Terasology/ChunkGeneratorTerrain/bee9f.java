diff --git a/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java b/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
index 11958ee..35330c2 100644
--- a/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
+++ b/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
@@ -85,10 +85,10 @@
                         break;
                     }
 
-                    if (y < 32 && y > 0) { // Ocean
+                    if (y <= 32 && y > 0) { // Ocean
                         c.setBlock(x, y, z, (byte) 0x4);
 
-                        if (y == 29) {
+                        if (y == 32) {
                             // Ice layer
                             if (type == BIOME_TYPE.SNOW)
                                 c.setBlock(x, y, z, (byte) 0x11);
