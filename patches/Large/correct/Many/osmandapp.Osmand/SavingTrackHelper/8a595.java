diff --git a/OsmAnd/src/net/osmand/plus/activities/SavingTrackHelper.java b/OsmAnd/src/net/osmand/plus/activities/SavingTrackHelper.java
index 9b6987b..df7f1d4 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SavingTrackHelper.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SavingTrackHelper.java
@@ -375,7 +375,7 @@
 					record = false;
 				}
 				float precision = settings.SAVE_TRACK_PRECISION.get();
-				if(precision > 0 && (!location.hasAccuracy() || location.getAccuracy() < precision)) {
+				if(precision > 0 && (!location.hasAccuracy() || location.getAccuracy() > precision)) {
 					record = false;
 				}
 				float minSpeed = settings.SAVE_TRACK_MIN_SPEED.get();
