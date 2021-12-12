diff --git a/OsmAnd/src/net/osmand/activities/SettingsActivity.java b/OsmAnd/src/net/osmand/activities/SettingsActivity.java
index 262cb61..ff12c20 100644
--- a/OsmAnd/src/net/osmand/activities/SettingsActivity.java
+++ b/OsmAnd/src/net/osmand/activities/SettingsActivity.java
@@ -121,7 +121,7 @@
 		}
 		
 		useInternetToDownload =(CheckBoxPreference) screen.findPreference(OsmandSettings.USE_INTERNET_TO_DOWNLOAD_TILES);
-		useInternetToDownload.setOnPreferenceClickListener(this);
+		useInternetToDownload.setOnPreferenceChangeListener(this);
 		
 		reloadIndexes =(Preference) screen.findPreference(OsmandSettings.RELOAD_INDEXES);
 		reloadIndexes.setOnPreferenceClickListener(this);
