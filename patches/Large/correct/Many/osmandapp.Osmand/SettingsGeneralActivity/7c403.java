diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
index 85da188..f0f3750 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
@@ -263,7 +263,7 @@
 				getString(R.string.lang_vi) + incompleteSuffix,
 				getString(R.string.lang_cy) + incompleteSuffix,};
 		String[] valuesPl = ConfigureMapMenu.getSortedMapNamesIds(this, entrieValues, entrieValues);
-		String[] idsPl = ConfigureMapMenu.getSortedMapNamesIds(this, entriesValues, entries);
+		String[] idsPl = ConfigureMapMenu.getSortedMapNamesIds(this, entrieValues, entries);
 		registerListPreference(settings.PREFERRED_LOCALE, screen, valuesPl, idsPl);
 
 		// Display "Device language" in Latin for all non-en languages
