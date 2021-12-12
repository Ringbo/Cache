diff --git a/DataExtractionOSM/src/net/osmand/binary/BinaryInspector.java b/DataExtractionOSM/src/net/osmand/binary/BinaryInspector.java
index 2912393..5e3f9cb 100644
--- a/DataExtractionOSM/src/net/osmand/binary/BinaryInspector.java
+++ b/DataExtractionOSM/src/net/osmand/binary/BinaryInspector.java
@@ -118,7 +118,7 @@
 		}
 		
 		public boolean contains(MapObject o){
-			return lattop >= o.getLocation().getLatitude() && latbottom >= o.getLocation().getLatitude()
+			return lattop >= o.getLocation().getLatitude() && latbottom <= o.getLocation().getLatitude()
 					&& lonleft <= o.getLocation().getLongitude() && lonright >= o.getLocation().getLongitude();
 			
 		}
