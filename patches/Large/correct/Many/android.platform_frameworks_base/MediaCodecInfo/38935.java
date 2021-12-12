diff --git a/media/java/android/media/MediaCodecInfo.java b/media/java/android/media/MediaCodecInfo.java
index ab13c7f..4513643 100644
--- a/media/java/android/media/MediaCodecInfo.java
+++ b/media/java/android/media/MediaCodecInfo.java
@@ -973,7 +973,7 @@
         }
 
         private boolean supports(
-                Integer width, Integer height, Double rate) {
+                Integer width, Integer height, Number rate) {
             boolean ok = true;
 
             if (ok && width != null) {
@@ -985,7 +985,7 @@
                         && (height % mHeightAlignment == 0);
             }
             if (ok && rate != null) {
-                ok = mFrameRateRange.contains(Utils.intRangeFor(rate));
+                ok = mFrameRateRange.contains(Utils.intRangeFor(rate.doubleValue()));
             }
             if (ok && height != null && width != null) {
                 ok = Math.min(height, width) <= mSmallerDimensionUpperLimit;
@@ -998,7 +998,7 @@
                                 new Rational(widthInBlocks, heightInBlocks))
                         && mAspectRatioRange.contains(new Rational(width, height));
                 if (ok && rate != null) {
-                    double blocksPerSec = blockCount * rate;
+                    double blocksPerSec = blockCount * rate.doubleValue();
                     ok = mBlocksPerSecondRange.contains(
                             Utils.longRangeFor(blocksPerSec));
                 }
@@ -1013,7 +1013,7 @@
             final Map<String, Object> map = format.getMap();
             Integer width = (Integer)map.get(MediaFormat.KEY_WIDTH);
             Integer height = (Integer)map.get(MediaFormat.KEY_HEIGHT);
-            Double rate = (Double)map.get(MediaFormat.KEY_FRAME_RATE);
+            Number rate = (Number)map.get(MediaFormat.KEY_FRAME_RATE);
 
             // we ignore color-format for now as it is not reliably reported by codec
 
