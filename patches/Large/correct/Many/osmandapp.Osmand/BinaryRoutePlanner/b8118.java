diff --git a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
index 3483f86..25c4f95 100644
--- a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
+++ b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
@@ -119,7 +119,7 @@
 	// calculate distance from C to AB (distnace doesn't calculate 
     private static double calculateDistance(int xA, int yA, int xB, int yB, int xC, int yC, double distAB){
     	// Scalar multiplication between (AB', AC)
-    	double multiple = (-convert31YToMeters(yB, yA)) * convert31XToMeters(xC,xA) + convert31YToMeters(xB,xA) * convert31YToMeters(yC, yA);
+    	double multiple = (-convert31YToMeters(yB, yA)) * convert31XToMeters(xC,xA) + convert31XToMeters(xB,xA) * convert31YToMeters(yC, yA);
     	return multiple / distAB;
     }
     
