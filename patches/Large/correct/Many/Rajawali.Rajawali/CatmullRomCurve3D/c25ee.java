diff --git a/src/rajawali/curves/CatmullRomCurve3D.java b/src/rajawali/curves/CatmullRomCurve3D.java
index cd1b4e8..f6e000d 100644
--- a/src/rajawali/curves/CatmullRomCurve3D.java
+++ b/src/rajawali/curves/CatmullRomCurve3D.java
@@ -93,13 +93,13 @@
 	protected double b(int i, double t) {
 		switch (i) {
 		case -2:
-			return ((-t + 2) * t - 1) * t / 2f;
+			return ((-t + 2) * t - 1) * t / 2.0;
 		case -1:
-			return (((3 * t - 5) * t) * t + 2) / 2f;
+			return (((3 * t - 5) * t) * t + 2) / 2.0;
 		case 0:
-			return ((-3 * t + 4) * t + 1) * t / 2f;
+			return ((-3 * t + 4) * t + 1) * t / 2.0;
 		case 1:
-			return ((t - 1) * t * t) / 2f;
+			return ((t - 1) * t * t) / 2.0;
 		}
 		return 0;
 	}
@@ -169,7 +169,7 @@
 
 		for (int i = 1; i <= segments; i++)
 		{
-			double t = i / segments;
+			double t = ((double) i) / segments;
 			calculatePoint(mTempPointLen, t);
 			double dist = mTempPrevLen.distanceTo(mTempPointLen);
 			totalLength += dist;
@@ -216,7 +216,7 @@
 			if (currentLength >= segmentDistance)
 			{
 				point = new Vector3();
-				calculatePoint(point, i / (numSegments - 1));
+				calculatePoint(point, i / (numSegments - 1.0));
 				newPoints.add(point);
 				currentLength = 0;
 			}
