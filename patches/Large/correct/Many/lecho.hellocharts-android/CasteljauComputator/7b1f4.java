diff --git a/hellocharts-library/src/lecho/lib/hellocharts/util/CasteljauComputator.java b/hellocharts-library/src/lecho/lib/hellocharts/util/CasteljauComputator.java
index ab061d3..8681f06 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/util/CasteljauComputator.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/util/CasteljauComputator.java
@@ -36,11 +36,11 @@
 		}
 
 		// Copy first raw of points into this.points[0] array.
-		System.arraycopy(points[0], 0, startPoints, 0, pointsNumber);
+		System.arraycopy(startPoints, 0, points[0], 0, pointsNumber);
 
-		for (int i = 1, pointsIndex = pointsNumber; i < curveDegree; ++i, pointsIndex -= 2) {
+		for (int i = 1, pointsIndex = pointsNumber - 2; i < curveDegree; ++i, pointsIndex -= 2) {
 
-			for (int indexX = 0, indexY = 1; indexY < pointsIndex; indexX += 2, indexY += 2) {
+			for (int indexX = 0, indexY = 1; indexY <= pointsIndex; indexX += 2, indexY += 2) {
 
 				// X value.
 				points[i][indexX] = (1 - t) * points[i - 1][indexX] + t * points[i - 1][indexX + 2];
