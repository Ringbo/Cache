diff --git a/datavec-data/datavec-data-image/src/test/java/org/datavec/image/transform/TestImageTransform.java b/datavec-data/datavec-data-image/src/test/java/org/datavec/image/transform/TestImageTransform.java
index c4bac6d..c9e9e13 100644
--- a/datavec-data/datavec-data-image/src/test/java/org/datavec/image/transform/TestImageTransform.java
+++ b/datavec-data/datavec-data-image/src/test/java/org/datavec/image/transform/TestImageTransform.java
@@ -157,10 +157,10 @@
 
     public static ImageWritable makeRandomImage(int height, int width, int channels) {
         if (height <= 0) {
-            height = rng.nextInt() % 100 + 100;
+            height = rng.nextInt() % 100 + 200;
         }
         if (width <= 0) {
-            width = rng.nextInt() % 100 + 100;
+            width = rng.nextInt() % 100 + 200;
         }
         Mat img = new Mat(height, width, CV_8UC(channels));
         UByteIndexer idx = img.createIndexer();
