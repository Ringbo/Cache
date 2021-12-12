diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/ts/H262Reader.java b/library/src/main/java/com/google/android/exoplayer/extractor/ts/H262Reader.java
index c61205d..8e94411 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/ts/H262Reader.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/ts/H262Reader.java
@@ -148,13 +148,13 @@
     int aspectRatioCode = (csdData[7] & 0xF0) >> 4;
     switch(aspectRatioCode) {
       case 2:
-        pixelWidthHeightRatio = (3 * width) / (float) (4 * height);
+        pixelWidthHeightRatio = (4 * height) / (float) (3 * width);
         break;
       case 3:
-        pixelWidthHeightRatio = (9 * width) / (float) (16 * height);
+        pixelWidthHeightRatio = (16 * height) / (float) (9 * width);
         break;
       case 4:
-        pixelWidthHeightRatio = (100 * width) / (float) (121 * height);
+        pixelWidthHeightRatio = (121 * height) / (float) (100 * width);
         break;
       default:
         // Do nothing.
