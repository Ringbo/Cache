diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java b/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
index ec43cd4..4005095 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
@@ -155,7 +155,7 @@
 				dateString = app.getString(R.string.last_seven_days);
 			} else if (dateHeader == THIS_YEAR_HEADER) {
 				dateString = app.getString(R.string.this_year);
-			} else if (dateHeader % 100 == 0) {
+			} else if (dateHeader / 100 == 0) {
 				dateString = getMonth(dateHeader);
 			} else {
 				dateString = String.valueOf(dateHeader);
