diff --git a/OsmAnd/src/net/osmand/plus/OsmandApplication.java b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
index 5b3a7d9..942efcc 100644
--- a/OsmAnd/src/net/osmand/plus/OsmandApplication.java
+++ b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
@@ -851,11 +851,11 @@
 		serviceIntent.putExtra(NavigationService.USAGE_INTENT, intent);
 		if (getNavigationService() == null) {
 			if (intent == NavigationService.USED_BY_GPX) {
-				if (getSettings().SAVE_GLOBAL_TRACK_INTERVAL.set() < 30000) {
+				if (getSettings().SAVE_GLOBAL_TRACK_INTERVAL.get() < 30000) {
 					getSettings().SERVICE_OFF_INTERVAL.set(0);
 				} else {
 					//Use SERVICE_OFF_INTERVAL > 0 to conserve power for longer GPX recording intervals
-					getSettings().SERVICE_OFF_INTERVAL.set(getSettings().SAVE_GLOBAL_TRACK_INTERVAL.set());
+					getSettings().SERVICE_OFF_INTERVAL.set(getSettings().SAVE_GLOBAL_TRACK_INTERVAL.get());
 				}
 			} else {
 				getSettings().SERVICE_OFF_INTERVAL.set(0);
