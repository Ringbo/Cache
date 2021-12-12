diff --git a/src/org/odk/collect/android/preferences/PreferencesActivity.java b/src/org/odk/collect/android/preferences/PreferencesActivity.java
index 46e8eb3..06423fe 100644
--- a/src/org/odk/collect/android/preferences/PreferencesActivity.java
+++ b/src/org/odk/collect/android/preferences/PreferencesActivity.java
@@ -99,7 +99,7 @@
                 AdminPreferencesActivity.ADMIN_PREFERENCES, 0);
 
         boolean serverAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_CHANGE_SERVER, false);
+                AdminPreferencesActivity.KEY_CHANGE_SERVER, true);
 
         PreferenceCategory serverCategory = (PreferenceCategory) findPreference(getString(R.string.server_preferences));
 
@@ -151,7 +151,7 @@
                 });
 
         boolean usernameAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_CHANGE_USERNAME, false);
+                AdminPreferencesActivity.KEY_CHANGE_USERNAME, true);
         if (!(usernameAvailable || adminMode)) {
             serverCategory.removePreference(mUsernamePreference);
         }
@@ -180,7 +180,7 @@
                 });
 
         boolean passwordAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_CHANGE_PASSWORD, false);
+                AdminPreferencesActivity.KEY_CHANGE_PASSWORD, true);
         if (!(passwordAvailable || adminMode)) {
             serverCategory.removePreference(mPasswordPreference);
         }
@@ -198,7 +198,7 @@
         mSelectedGoogleAccountPreference.setSummary(mSelectedGoogleAccountPreference
                 .getSharedPreferences().getString(KEY_ACCOUNT, ""));
         boolean googleAccounAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_CHANGE_GOOGLE_ACCOUNT, false);
+                AdminPreferencesActivity.KEY_CHANGE_GOOGLE_ACCOUNT, true);
         if (!(googleAccounAvailable || adminMode)) {
             serverCategory.removePreference(mSelectedGoogleAccountPreference);
         }
@@ -232,7 +232,7 @@
         PreferenceCategory clientCategory = (PreferenceCategory) findPreference(getString(R.string.client));
 
         boolean fontAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_CHANGE_FONT_SIZE, false);
+                AdminPreferencesActivity.KEY_CHANGE_FONT_SIZE, true);
         mFontSizePreference = (ListPreference) findPreference(KEY_FONT_SIZE);
         mFontSizePreference.setSummary(mFontSizePreference.getEntry());
         mFontSizePreference
@@ -252,7 +252,7 @@
         }
 
         boolean defaultAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_DEFAULT_TO_FINALIZED, false);
+                AdminPreferencesActivity.KEY_DEFAULT_TO_FINALIZED, true);
 
         Preference defaultFinalized = findPreference(KEY_COMPLETED_DEFAULT);
         if (!(defaultAvailable || adminMode)) {
@@ -260,7 +260,7 @@
         }
 
         boolean splashAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_SELECT_SPLASH_SCREEN, false);
+                AdminPreferencesActivity.KEY_SELECT_SPLASH_SCREEN, true);
         mSplashPathPreference = (PreferenceScreen) findPreference(KEY_SPLASH_PATH);
         mSplashPathPreference
                 .setOnPreferenceClickListener(new OnPreferenceClickListener() {
@@ -323,7 +323,7 @@
         }
 
         boolean showSplashAvailable = adminPreferences.getBoolean(
-                AdminPreferencesActivity.KEY_SHOW_SPLASH_SCREEN, false);
+                AdminPreferencesActivity.KEY_SHOW_SPLASH_SCREEN, true);
 
         CheckBoxPreference showSplashPreference = (CheckBoxPreference) findPreference(KEY_SHOW_SPLASH);
 
