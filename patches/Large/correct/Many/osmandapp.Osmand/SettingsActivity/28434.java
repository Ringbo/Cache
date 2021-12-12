diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
index 0cc1215..d095d4b 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
@@ -462,7 +462,7 @@
 		
 		updateApplicationDirTextAndSummary();
 
-		applicationModePreference.setTitle(getString(R.string.settings_preset) + "  [" + ApplicationMode.toHumanString(osmandSettings.APPLICATION_MODE.get()) + "]");
+		applicationModePreference.setTitle(getString(R.string.settings_preset) + "  [" + ApplicationMode.toHumanString(osmandSettings.APPLICATION_MODE.get(), this) + "]");
     }
 
 	private void updateTileSourceSummary() {
