diff --git a/DataExtractionOSM/src/net/osmand/osm/MapRenderingTypes.java b/DataExtractionOSM/src/net/osmand/osm/MapRenderingTypes.java
index 0557a73..e72a70c 100644
--- a/DataExtractionOSM/src/net/osmand/osm/MapRenderingTypes.java
+++ b/DataExtractionOSM/src/net/osmand/osm/MapRenderingTypes.java
@@ -531,7 +531,7 @@
 			}
 		} else if(e.getTag(OSMTagKey.BRIDGE) != null){
 			return 2;
-		} else if(e.getTag(OSMTagKey.TUNNEL) != null){
+		} else if(e.getTag(OSMTagKey.TUNNEL) != null && !e.getTag(OSMTagKey.TUNNEL).equalsIgnoreCase("no")){
 			return 1;
 		}
 		return 0;
