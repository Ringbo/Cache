diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
index de3524d..441808c 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
@@ -159,7 +159,7 @@
 	public EditTextPreference createEditTextPreference(OsmandPreference<String> b, int title, int summary){
 		EditTextPreference p = new EditTextPreference(this);
 		p.setTitle(title);
-		p.setKey(b.get());
+		p.setKey(b.getId());
 		p.setDialogTitle(title);
 		p.setSummary(summary);
 		p.setOnPreferenceChangeListener(this);
