diff --git a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
index 9bf8c02..15be819 100644
--- a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
+++ b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
@@ -420,7 +420,7 @@
 
 	private void startTourImpl(TourInformation tour) {
 		StageInformation stage;
-		if (tour.getStageInformation().isEmpty()) {
+		if (!tour.getStageInformation().isEmpty()) {
 			if (tour != customization.getSelectedTour() || customization.getSelectedStage() == null) {
 				stage = tour.getStageInformation().get(0);
 			} else {
