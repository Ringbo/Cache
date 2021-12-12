diff --git a/java/libraries/video/src/processing/video/Video.java b/java/libraries/video/src/processing/video/Video.java
index 72384b6..0d58a13 100644
--- a/java/libraries/video/src/processing/video/Video.java
+++ b/java/libraries/video/src/processing/video/Video.java
@@ -212,7 +212,7 @@
       for (int y = 0; y < height; y++) {
         for (int x = 0; x < width; x++) {
           int pixel = pixels[p++];
-          pixels[t++] = (pixel >> 8) | ((pixel << 24) & 0xFF000000);
+          pixels[t++] = (pixel >>> 8) | ((pixel << 24) & 0xFF000000);
         }
       }
 
