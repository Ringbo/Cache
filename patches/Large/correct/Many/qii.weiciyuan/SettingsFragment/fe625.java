diff --git a/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java b/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
index acdfbb3..9475ed6 100644
--- a/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
+++ b/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
@@ -95,7 +95,7 @@
         if (key.equals(SettingActivity.ENABLE_FETCH_MSG)) {
             boolean value = sharedPreferences.getBoolean(key, false);
             if (value) {
-                AppNewMsgAlarm.startAlarm(getActivity(), true);
+                AppNewMsgAlarm.startAlarm(getActivity(), false);
             } else {
                 AppNewMsgAlarm.stopAlarm(getActivity(), true);
             }
