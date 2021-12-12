diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
index c5abc14..8a4565f 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
@@ -471,7 +471,7 @@
 		updateApplicationDirTextAndSummary();
 
 		applicationModePreference.setTitle(getString(R.string.settings_preset) + "  [" + ApplicationMode.toHumanString(osmandSettings.APPLICATION_MODE.get(), this) + "]");
-		dayNightModePreference.setSummary(getString(R.string.daynight_descr) + "  [" + osmandSettings.DAYNIGHT_MODE.get().toHumanString(ctx) + "]");
+		dayNightModePreference.setSummary(getString(R.string.daynight_descr) + "  [" + osmandSettings.DAYNIGHT_MODE.get().toHumanString(this) + "]");
 		routerServicePreference.setSummary(getString(R.string.router_service_descr) + "  [" + osmandSettings.ROUTER_SERVICE.get() + "]");
     }
 
@@ -578,7 +578,7 @@
 					finish();
 					startActivity(intent);
 				} else if (listPref.getId().equals(osmandSettings.DAYNIGHT_MODE.getId())) {
-					dayNightModePreference.setSummary(getString(R.string.daynight_descr) + "  [" + osmandSettings.DAYNIGHT_MODE.get().toHumanString(ctx)  + "]");
+					dayNightModePreference.setSummary(getString(R.string.daynight_descr) + "  [" + osmandSettings.DAYNIGHT_MODE.get().toHumanString(this)  + "]");
 				} else if (listPref.getId().equals(osmandSettings.ROUTER_SERVICE.getId())) {
 					routerServicePreference.setSummary(getString(R.string.router_service_descr) + "  [" + osmandSettings.ROUTER_SERVICE.get() + "]");
 				}
