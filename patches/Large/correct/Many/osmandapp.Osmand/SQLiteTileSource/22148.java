diff --git a/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java b/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
index e4a2f82..211e4f3 100644
--- a/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
+++ b/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
@@ -152,9 +152,9 @@
 			try {
 				long z;
 				z = db.compileStatement("SELECT minzoom FROM info").simpleQueryForLong(); //$NON-NLS-1$
-				if (z < 17 && z >= 0)
+				if (z < 17 )
 					baseZoom = 17 - (int)z; // sqlite base zoom, =11 for SRTM hillshade
-				maxZoom = 17; // Cheat to have tiles request even if zoom level not in sqlite
+				maxZoom = 24; // Cheat to have tiles request even if zoom level not in sqlite
 				// decrease maxZoom if too much scaling would be required
 				while ((tileSize >> (maxZoom - baseZoom)) < minScaledSize)
 					maxZoom--;
