diff --git a/src/wms/src/main/java/org/geoserver/wms/map/PNGMapResponse.java b/src/wms/src/main/java/org/geoserver/wms/map/PNGMapResponse.java
index 0bab53b..fc920d2 100644
--- a/src/wms/src/main/java/org/geoserver/wms/map/PNGMapResponse.java
+++ b/src/wms/src/main/java/org/geoserver/wms/map/PNGMapResponse.java
@@ -85,7 +85,7 @@
         SampleModel sm = image.getSampleModel();
         int numBits = sm.getSampleSize(0);
         // png acceleration only works on 2 bit and 8 bit images, crashes on 4 bits
-        boolean nativeAcceleration = PNGNativeAcc.booleanValue() && (numBits > 1 && numBits < 8);
+        boolean nativeAcceleration = PNGNativeAcc.booleanValue() && !(numBits > 1 && numBits < 8);
         new ImageWorker(image).writePNG(outStream, "FILTERED", quality,
                 nativeAcceleration, image.getColorModel() instanceof IndexColorModel);
 
