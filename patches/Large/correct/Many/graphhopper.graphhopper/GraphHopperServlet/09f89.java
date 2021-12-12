diff --git a/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java b/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
index 3bb738b..3afa56b 100644
--- a/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
+++ b/web/src/main/java/com/graphhopper/http/GraphHopperServlet.java
@@ -126,7 +126,7 @@
                 FlagEncoder algoVehicle = hopper.getEncodingManager().getEncoder(vehicleStr);
                 rsp = hopper.route(new GHRequest(start, end).
                         setVehicle(algoVehicle.toString()).
-                        setType(vehicleStr).
+                        setType(algoTypeStr).
                         setAlgorithm(algoStr).
                         putHint("calcPoints", calcPoints).
                         putHint("instructions", enableInstructions).
