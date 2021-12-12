diff --git a/src/main/java/org/terasology/rendering/assetLoaders/PNGTextureLoader.java b/src/main/java/org/terasology/rendering/assetLoaders/PNGTextureLoader.java
index 827c69e..0ef47c2 100644
--- a/src/main/java/org/terasology/rendering/assetLoaders/PNGTextureLoader.java
+++ b/src/main/java/org/terasology/rendering/assetLoaders/PNGTextureLoader.java
@@ -67,7 +67,7 @@
             throw new IOException("Missing png to go with texture json");
         }
         try {
-            PNGDecoder decoder = new PNGDecoder(stream);
+            PNGDecoder decoder = new PNGDecoder(pngStream);
 
             ByteBuffer buf = ByteBuffer.allocateDirect(4 * decoder.getWidth() * decoder.getHeight());
             decoder.decode(buf, decoder.getWidth() * 4, PNGDecoder.RGBA);
