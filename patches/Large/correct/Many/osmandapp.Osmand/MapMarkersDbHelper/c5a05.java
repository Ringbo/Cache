diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
index 910ad1c..f5c798b 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
@@ -269,7 +269,7 @@
 		boolean active = query.getInt(4) == 1;
 		long added = query.getLong(5);
 		long visited = query.getLong(6);
-		long groupKey = query.getInt(7);
+		long groupKey = query.getLong(7);
 		int colorIndex = query.getInt(8);
 		long nextKey = query.getLong(9);
 
