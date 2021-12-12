diff --git a/engine/src/tools/jme3tools/converters/ImageToAwt.java b/engine/src/tools/jme3tools/converters/ImageToAwt.java
index 2af6140..3e03451 100644
--- a/engine/src/tools/jme3tools/converters/ImageToAwt.java
+++ b/engine/src/tools/jme3tools/converters/ImageToAwt.java
@@ -209,7 +209,7 @@
     public static void convert(BufferedImage image, Format format, ByteBuffer buf){
         DecodeParams p = params.get(format);
         if (p == null)
-            throw new UnsupportedOperationException();
+            throw new UnsupportedOperationException("Image format " + format + " is not supported");
 
         int width = image.getWidth();
         int height = image.getHeight();
