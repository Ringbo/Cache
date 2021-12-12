diff --git a/DataExtractionOSM/src/net/osmand/map/TileSourceManager.java b/DataExtractionOSM/src/net/osmand/map/TileSourceManager.java
index bac61d8..6f434ac 100644
--- a/DataExtractionOSM/src/net/osmand/map/TileSourceManager.java
+++ b/DataExtractionOSM/src/net/osmand/map/TileSourceManager.java
@@ -188,7 +188,7 @@
 			return def;
 		}
 		try {
-			return Integer.parseInt(value);
+			return Integer.parseInt(val);
 		} catch (NumberFormatException e) {
 			return def;
 		}
