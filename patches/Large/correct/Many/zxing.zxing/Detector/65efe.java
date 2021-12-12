diff --git a/core/src/com/google/zxing/datamatrix/detector/Detector.java b/core/src/com/google/zxing/datamatrix/detector/Detector.java
index d7d0c8d..140173d 100644
--- a/core/src/com/google/zxing/datamatrix/detector/Detector.java
+++ b/core/src/com/google/zxing/datamatrix/detector/Detector.java
@@ -276,7 +276,7 @@
 		
 		ResultPoint c1 = new ResultPoint(topRight.getX() + corr * cos, topRight.getY() + corr * sin);
 	
-		corr = distance(bottomLeft, bottomRight) / (float) dimension;
+		corr = distance(bottomLeft, topLeft) / (float) dimension;
 		norm = distance(bottomRight, topRight);
 		cos = (topRight.getX() - bottomRight.getX()) / norm;
 		sin = (topRight.getY() - bottomRight.getY()) / norm;
