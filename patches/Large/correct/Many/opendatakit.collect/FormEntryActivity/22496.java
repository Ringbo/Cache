diff --git a/src/org/odk/collect/android/activities/FormEntryActivity.java b/src/org/odk/collect/android/activities/FormEntryActivity.java
index 2809f3e..46aa0a1 100644
--- a/src/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/src/org/odk/collect/android/activities/FormEntryActivity.java
@@ -656,23 +656,23 @@
         menu.removeItem(MENU_SAVE);
         menu.removeItem(MENU_PREFERENCES);
 
-        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, false)) {
+        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, true)) {
             menu.add(0, MENU_SAVE, 0, R.string.save_all_answers).setIcon(
                     android.R.drawable.ic_menu_save);
         }
-        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_JUMP_TO, false)) {
+        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_JUMP_TO, true)) {
             menu.add(0, MENU_HIERARCHY_VIEW, 0,
                     getString(R.string.view_hierarchy)).setIcon(
                     R.drawable.ic_menu_goto);
         }
-        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_LANGUAGE, false)) {
+        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_LANGUAGE, true)) {
             menu.add(0, MENU_LANGUAGES, 0, getString(R.string.change_language))
                     .setIcon(R.drawable.ic_menu_start_conversation)
                     .setEnabled(
                             (formController.getLanguages() == null || formController
                                     .getLanguages().length == 1) ? false : true);
         }
-        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_ACCESS_SETTINGS, false)) {
+        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_ACCESS_SETTINGS, true)) {
             menu.add(0, MENU_PREFERENCES, 0,
                     getString(R.string.general_preferences)).setIcon(
                     android.R.drawable.ic_menu_preferences);
@@ -858,14 +858,14 @@
                 instanceComplete.setChecked(isInstanceComplete(true));
 
                 if (!mAdminPreferences.getBoolean(
-                        AdminPreferencesActivity.KEY_MARK_AS_FINALIZED, false)) {
+                        AdminPreferencesActivity.KEY_MARK_AS_FINALIZED, true)) {
                     instanceComplete.setVisibility(View.GONE);
                 }
 
                 // edittext to change the displayed name of the instance
                 final EditText saveAs = (EditText) endView.findViewById(R.id.save_name);
 
-                if (!mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_AS, false)) {
+                if (!mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_AS, true)) {
                     saveAs.setVisibility(View.GONE);
                     TextView sa = (TextView) endView.findViewById(R.id.save_form_as);
                     sa.setVisibility(View.GONE);
@@ -1364,7 +1364,7 @@
     private void createQuitDialog() {
         FormController formController = Collect.getInstance().getFormController();
         String[] items;
-        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, false)) {
+        if (mAdminPreferences.getBoolean(AdminPreferencesActivity.KEY_SAVE_MID, true)) {
             String[] two = {
                     getString(R.string.keep_changes),
                     getString(R.string.do_not_save)
@@ -1407,7 +1407,7 @@
                                 // the admin menu, then case 0 actually becomes 'discard and exit'
                                 // whereas if it's enabled it's 'save and exit'
                                 if (mAdminPreferences.getBoolean(
-                                        AdminPreferencesActivity.KEY_SAVE_MID, false)) {
+                                        AdminPreferencesActivity.KEY_SAVE_MID, true)) {
                                     Collect.getInstance()
                                             .getActivityLogger()
                                             .logInstanceAction(this, "createQuitDialog",
