diff --git a/engine/src/main/java/org/terasology/utilities/procedural/HeightmapFileReader.java b/engine/src/main/java/org/terasology/utilities/procedural/HeightmapFileReader.java
index eb71d88..49db185 100644
--- a/engine/src/main/java/org/terasology/utilities/procedural/HeightmapFileReader.java
+++ b/engine/src/main/java/org/terasology/utilities/procedural/HeightmapFileReader.java
@@ -40,7 +40,7 @@
     public static void convertFileToTexture() throws IOException {
         float[][] heightmap = readFile();
 
-        double scaleFactor = 256 * 256 * 12.8f;
+        double scaleFactor = 256 * 256 * 12.8;
 
 //        Slick's PNGDecoder does not support 16 bit textures
 
