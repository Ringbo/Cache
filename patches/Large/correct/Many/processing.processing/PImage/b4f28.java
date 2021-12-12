diff --git a/core/src/processing/core/PImage.java b/core/src/processing/core/PImage.java
index 0c64c43..c1b38f0 100644
--- a/core/src/processing/core/PImage.java
+++ b/core/src/processing/core/PImage.java
@@ -691,7 +691,7 @@
         throw new RuntimeException("Use filter(POSTERIZE, int levels) " +
         "instead of filter(POSTERIZE)");
 
-      case RGB:
+      case OPAQUE:
         for (int i = 0; i < pixels.length; i++) {
           pixels[i] |= 0xff000000;
         }
