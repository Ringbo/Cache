diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
index d01e6bb..2de31af 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsGeneralActivity.java
@@ -264,7 +264,7 @@
 				getString(R.string.lang_cy) + incompleteSuffix,};
 		String[] valuesPl = ConfigureMapMenu.getSortedMapNamesIds(this, entrieValues, entrieValues);
 		String[] idsPl = ConfigureMapMenu.getSortedMapNamesIds(this, entries, valuesPl);
-		registerListPreference(settings.PREFERRED_LOCALE, screen, idsPl, valuesPl);
+		registerListPreference(settings.PREFERRED_LOCALE, screen, valuesPl, idsPl);
 
 		// Display "Device language" in Latin for all non-en languages
 		if (!getResources().getString(R.string.preferred_locale).equals(getResources().getString(R.string.preferred_locale_no_translate))) {
