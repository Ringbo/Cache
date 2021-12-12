diff --git a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
index 31b090d..3483f86 100644
--- a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
+++ b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
@@ -119,13 +119,13 @@
 	// calculate distance from C to AB (distnace doesn't calculate 
     private static double calculateDistance(int xA, int yA, int xB, int yB, int xC, int yC, double distAB){
     	// Scalar multiplication between (AB', AC)
-    	double multiple = (-convert31YToMeters(yB, yA)) * convert31XToMeters(xC,xA) + convert31XToMeters(xB,xA) * convert31YToMeters(yC, yA);
+    	double multiple = (-convert31YToMeters(yB, yA)) * convert31XToMeters(xC,xA) + convert31YToMeters(xB,xA) * convert31YToMeters(yC, yA);
     	return multiple / distAB;
     }
     
 	private static double calculateProjection(int xA, int yA, int xB, int yB, int xC, int yC, double distAB) {
 		// Scalar multiplication between (AB, AC)
-		double multiple = convert31XToMeters(xB, xA) * convert31XToMeters(xC, xA) + convert31XToMeters(yB, yA) * convert31YToMeters(yC, yA);
+		double multiple = convert31XToMeters(xB, xA) * convert31XToMeters(xC, xA) + convert31YToMeters(yB, yA) * convert31YToMeters(yC, yA);
 		return multiple / distAB;
 	}
 	
