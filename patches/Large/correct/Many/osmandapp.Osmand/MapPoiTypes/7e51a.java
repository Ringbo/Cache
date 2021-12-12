diff --git a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
index f3bba0f..dbe0b36 100644
--- a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
+++ b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
@@ -107,7 +107,7 @@
 			name = "leisure";
 		}
 		for(PoiCategory p : categories ) {
-			if(p.getName().equals(name)) {
+			if(p.getName().equals(name) || p.getKey().equalsIgnoreCase(name)) {
 				return p;
 			}
 		}
