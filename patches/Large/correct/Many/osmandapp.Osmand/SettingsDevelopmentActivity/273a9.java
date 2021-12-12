diff --git a/OsmAnd/src/net/osmand/plus/development/SettingsDevelopmentActivity.java b/OsmAnd/src/net/osmand/plus/development/SettingsDevelopmentActivity.java
index 0b35551..9dba889 100644
--- a/OsmAnd/src/net/osmand/plus/development/SettingsDevelopmentActivity.java
+++ b/OsmAnd/src/net/osmand/plus/development/SettingsDevelopmentActivity.java
@@ -98,15 +98,14 @@
 		//pref.setEnabled(false);
 		cat.addPreference(pref);
 		
-		long agpsLastDonwloaded = settings.AGPS_DATA_LAST_TIME_DOWNLOADED.get();
+		long agpsLastDownloaded = settings.AGPS_DATA_LAST_TIME_DOWNLOADED.get();
 		pref = new Preference(this);
 		pref.setTitle(R.string.agps_info);
-		if (agpsLastDonwloaded != null) {
+		if (agpsLastDownloaded != null) {
 			SimpleDateFormat prt = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
-			pref.setSummary(getString(R.string.agps_data_last_downloaded, prt.format(agpsLastDonwloaded)));
+			pref.setSummary(getString(R.string.agps_data_last_downloaded, prt.format(agpsLastDownloaded)));
 		} else {
-			pref.setSummary(getString(R.string.agps_data_last_downloaded, "null",
-					"null"));
+			pref.setSummary(getString(R.string.agps_data_last_downloaded, "null"));
 		}
 		pref.setSelectable(false);
 		//setEnabled(false) creates bad readability on some devices
@@ -121,7 +120,7 @@
 			pref.setSummary(getString(R.string.day_night_info_description, prt.format(sunriseSunset.getSunrise()),
 					prt.format(sunriseSunset.getSunset())));
 		} else {
-			pref.setSummary(getString(R.string.day_night_info_description, "null"));
+			pref.setSummary(getString(R.string.day_night_info_description, "null", "null"));
 		}
 		pref.setSelectable(false);
 		//setEnabled(false) creates bad readability on some devices
