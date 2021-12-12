diff --git a/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java b/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
index 45b6ae9..a5bca91 100644
--- a/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
+++ b/src/com/github/begla/blockmania/generators/ChunkGeneratorTerrain.java
@@ -28,7 +28,7 @@
 
     /* CONST */
     protected static final int SAMPLE_RATE_3D_HOR = 2;
-    protected static final int SAMPLE_RATE_3D_VERT = 16;
+    protected static final int SAMPLE_RATE_3D_VERT = 8;
 
     /**
      * Available types of biomes.
@@ -225,23 +225,23 @@
 
         if (type == BIOME_TYPE.DESERT) {
             freqY *= 1.0;
-            amp *= 0.1;
+            amp *= 0.0;
         } else if (type == BIOME_TYPE.PLAINS) {
             freqY *= 1.0;
-            amp *= 0.1;
+            amp *= 0.0;
         } else if (type == BIOME_TYPE.MOUNTAINS) {
             freqY *= 1.0;
             amp *= 1.0;
         } else if (type == BIOME_TYPE.SNOW) {
             freqY *= 1.0;
-            amp *= 0.3;
+            amp *= 0.9;
         } else if (type == BIOME_TYPE.FOREST) {
             freqY *= 1.0;
-            amp *= 0.5;
+            amp *= 0.9;
         }
 
         double density = calcMountainDensity(x, y * freqY, z) * amp;
-        return -y + ((height * 64.0 + 16.0) + (density * height) * 256.0);
+        return -y + ((height * 64.0 + 16.0) + density * 64.0);
     }
 
     public double calcBaseTerrain(double x, double z) {
