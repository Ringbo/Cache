diff --git a/core/src/com/google/zxing/common/GridSampler.java b/core/src/com/google/zxing/common/GridSampler.java
index 93a3900..b847a31 100644
--- a/core/src/com/google/zxing/common/GridSampler.java
+++ b/core/src/com/google/zxing/common/GridSampler.java
@@ -113,7 +113,7 @@
    * @param points actual points in x1,y1,...,xn,yn form
    * @throws ReaderException if an endpoint is lies outside the image boundaries
    */
-  static void checkAndNudgePoints(MonochromeBitmapSource image, float[] points) throws ReaderException {
+  protected static void checkAndNudgePoints(MonochromeBitmapSource image, float[] points) throws ReaderException {
     int width = image.getWidth();
     int height = image.getHeight();
     // Check and nudge points from start until we see some that are OK:
