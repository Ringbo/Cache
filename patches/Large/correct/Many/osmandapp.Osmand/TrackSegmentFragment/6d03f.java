diff --git a/OsmAnd/src/net/osmand/plus/myplaces/TrackSegmentFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/TrackSegmentFragment.java
index 4af4de1..833dc76 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/TrackSegmentFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/TrackSegmentFragment.java
@@ -1296,7 +1296,7 @@
 		}
 
 		void updateChart(LineChart chart) {
-			if (chart != null) {
+			if (chart != null && !chart.isEmpty()) {
 				if (gpxItem.chartMatrix != null) {
 					chart.getViewPortHandler().refresh(new Matrix(gpxItem.chartMatrix), chart, true);
 				}
