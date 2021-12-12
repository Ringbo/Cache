diff --git a/OsmAnd/src/net/osmand/plus/monitoring/SettingsMonitoringActivity.java b/OsmAnd/src/net/osmand/plus/monitoring/SettingsMonitoringActivity.java
index fa1049f..bfdef75 100644
--- a/OsmAnd/src/net/osmand/plus/monitoring/SettingsMonitoringActivity.java
+++ b/OsmAnd/src/net/osmand/plus/monitoring/SettingsMonitoringActivity.java
@@ -108,7 +108,7 @@
 		names = new String[floatValues.length];
 		names[0] = getString(R.string.shared_string_not_selected);
 		names[1] = "> 0";
-		for(int i = 1; i < floatValues.length; i++) {
+		for(int i = 2; i < floatValues.length; i++) {
 			names[i] = floatValues[i].intValue() + " " + getString(R.string.km_h);
 			floatValues[i] = floatValues[i] / 3.6f;
 		}
