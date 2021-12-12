diff --git a/OsmAnd/src/net/osmand/plus/monitoring/OsmandMonitoringPlugin.java b/OsmAnd/src/net/osmand/plus/monitoring/OsmandMonitoringPlugin.java
index 9a98b6f..8090632 100644
--- a/OsmAnd/src/net/osmand/plus/monitoring/OsmandMonitoringPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/monitoring/OsmandMonitoringPlugin.java
@@ -125,7 +125,7 @@
 		cat.addPreference(activity.createCheckBoxPreference(settings.SAVE_TRACK_TO_GPX, R.string.save_track_to_gpx,
 				R.string.save_track_to_gpx_descrp));
 		cat.addPreference(activity.createTimeListPreference(settings.SAVE_TRACK_INTERVAL, SECONDS,
-				MINUTES, 1, R.string.save_track_interval, R.string.save_track_interval_descr));
+				MINUTES, 1000, R.string.save_track_interval, R.string.save_track_interval_descr));
 
 		cat = new PreferenceCategory(activity);
 		cat.setTitle(R.string.live_monitoring);
@@ -134,7 +134,7 @@
 		cat.addPreference(activity.createCheckBoxPreference(settings.LIVE_MONITORING, R.string.live_monitoring,
 				R.string.live_monitoring_descr));
 		cat.addPreference(activity.createTimeListPreference(settings.LIVE_MONITORING_INTERVAL, SECONDS,
-				MINUTES, 1, R.string.live_monitoring_interval, R.string.live_monitoring_interval_descr));
+				MINUTES, 1000, R.string.live_monitoring_interval, R.string.live_monitoring_interval_descr));
 
 		cat = new PreferenceCategory(activity);
 		cat.setTitle(R.string.monitor_preferences);
