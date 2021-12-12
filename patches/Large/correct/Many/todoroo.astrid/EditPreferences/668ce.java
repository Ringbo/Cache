diff --git a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
index 5c16c9f..a418b75 100644
--- a/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
+++ b/astrid/src/com/todoroo/astrid/activity/EditPreferences.java
@@ -190,7 +190,7 @@
         });
 
         PreferenceScreen appearance = (PreferenceScreen) screen.getPreference(APPEARANCE_PREFERENCE);
-        Preference beastMode = appearance.getPreference(1);
+        Preference beastMode = appearance.getPreference(3);
         beastMode.setOnPreferenceClickListener(new OnPreferenceClickListener() {
             @Override
             public boolean onPreferenceClick(Preference p) {
