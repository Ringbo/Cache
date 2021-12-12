diff --git a/src/org/thoughtcrime/securesms/ApplicationPreferencesActivity.java b/src/org/thoughtcrime/securesms/ApplicationPreferencesActivity.java
index ada1ad0..0266765 100644
--- a/src/org/thoughtcrime/securesms/ApplicationPreferencesActivity.java
+++ b/src/org/thoughtcrime/securesms/ApplicationPreferencesActivity.java
@@ -215,7 +215,7 @@
       this.findPreference(PREFERENCE_CATEGORY_APPEARANCE).setIcon(appearance);
       this.findPreference(PREFERENCE_CATEGORY_CHATS).setIcon(chats);
       this.findPreference(PREFERENCE_CATEGORY_DEVICES).setIcon(devices);
-      this.findPreference(PREFERENCE_CATEGORY_ADVANCED).setIcon(appearance);
+      this.findPreference(PREFERENCE_CATEGORY_ADVANCED).setIcon(advanced);
     }
 
     private class CategoryClickListener implements Preference.OnPreferenceClickListener {
