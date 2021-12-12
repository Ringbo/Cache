diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index e8c2457..78b2a1a 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -3841,6 +3841,8 @@
     int h = ((header[15] & 0xff) << 8) + (header[14] & 0xff);
     PImage outgoing = createImage(w, h, format);
 
+    // where "reversed" means upper-left corner (normal for most of
+    // the modernized world, but "reversed" for the tga spec)
     boolean reversed = (header[17] & 0x20) != 0;
 
     if ((header[2] == 2) || (header[2] == 3)) {  // not RLE encoded
@@ -3954,7 +3956,7 @@
         }
       }
 
-      if (reversed) {
+      if (!reversed) {
         int[] temp = new int[w];
         for (int y = 0; y < h/2; y++) {
           int z = (h-1) - y;
