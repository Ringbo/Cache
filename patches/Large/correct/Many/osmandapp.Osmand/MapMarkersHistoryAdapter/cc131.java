diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java b/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
index e532eae..ec43cd4 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/adapters/MapMarkersHistoryAdapter.java
@@ -53,7 +53,7 @@
 			int markerDay = markerCalendar.get(Calendar.DAY_OF_YEAR);
 			int markerMonth = markerCalendar.get(Calendar.MONTH);
 			int markerYear = markerCalendar.get(Calendar.YEAR);
-			if (markerYear == currentYear) {
+			if (markerYear == currentYear || markerYear == 1970) {
 				if (markerDay == currentDay) {
 					if (previousHeader != TODAY_HEADER) {
 						items.add(TODAY_HEADER);
