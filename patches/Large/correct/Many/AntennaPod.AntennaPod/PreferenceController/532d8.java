diff --git a/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java b/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
index c1aea28..29bbee9 100644
--- a/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
+++ b/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
@@ -887,7 +887,7 @@
 
     private void checkSonicItemVisibility() {
         if (Build.VERSION.SDK_INT < 16) {
-            MaterialListPreference p = ((MaterialListPreference) ui.findPreference(UserPreferences.PREF_MEDIA_PLAYER));
+            ListPreference p = (ListPreference) ui.findPreference(UserPreferences.PREF_MEDIA_PLAYER);
             p.setEntries(R.array.media_player_options_no_sonic);
             p.setEntryValues(R.array.media_player_values_no_sonic);
         }
