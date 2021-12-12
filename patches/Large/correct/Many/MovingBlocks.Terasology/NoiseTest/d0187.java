diff --git a/engine/src/test/java/org/terasology/utilities/NoiseTest.java b/engine/src/test/java/org/terasology/utilities/NoiseTest.java
index f120671..59ae4d3 100644
--- a/engine/src/test/java/org/terasology/utilities/NoiseTest.java
+++ b/engine/src/test/java/org/terasology/utilities/NoiseTest.java
@@ -41,7 +41,7 @@
         FastRandom sfr = new FastRandom(seed);
         
         PerlinNoise pn = new PerlinNoise(seed);
-        SimplexNoise sn = new SimplexNoise();
+        SimplexNoise sn = new SimplexNoise(seed);
         
         for (int i = 0; i < warmUp; i++) {
             double posX = pfr.nextDouble() * 1000d;
