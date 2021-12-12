diff --git a/core/src/processing/core/PGraphicsJava2D.java b/core/src/processing/core/PGraphicsJava2D.java
index a687c59..79c5e30 100644
--- a/core/src/processing/core/PGraphicsJava2D.java
+++ b/core/src/processing/core/PGraphicsJava2D.java
@@ -861,7 +861,7 @@
         src.getDataElements(0, y, width, 1, srcPixels);
         dstIn.getDataElements(0, y, width, 1, dstPixels);
         for (int x = 0; x < width; x++) {
-          dstPixels[x] = blendColor(srcPixels[x], alphaFiller | dstPixels[x], mode);
+          dstPixels[x] = blendColor(alphaFiller | dstPixels[x], srcPixels[x], mode);
         }
         dstOut.setDataElements(0, y, width, 1, dstPixels);
       }
