diff --git a/src/main/java/org/bukkit/util/noise/PerlinNoiseGenerator.java b/src/main/java/org/bukkit/util/noise/PerlinNoiseGenerator.java
index 1ac7742..10b1d24 100644
--- a/src/main/java/org/bukkit/util/noise/PerlinNoiseGenerator.java
+++ b/src/main/java/org/bukkit/util/noise/PerlinNoiseGenerator.java
@@ -189,7 +189,7 @@
      * @param amplitude How much to alter the amplitude by each octave
      * @return Resulting noise
      */
-    public double getNoise(double x, double y, int octaves, double frequency, double amplitude) {
+    public static double getNoise(double x, double y, int octaves, double frequency, double amplitude) {
         return instance.noise(x, y, octaves, frequency, amplitude);
     }
 
@@ -204,7 +204,7 @@
      * @param amplitude How much to alter the amplitude by each octave
      * @return Resulting noise
      */
-    public double getNoise(double x, double y, double z, int octaves, double frequency, double amplitude) {
+    public static double getNoise(double x, double y, double z, int octaves, double frequency, double amplitude) {
         return instance.noise(x, y, z, octaves, frequency, amplitude);
     }
 }
