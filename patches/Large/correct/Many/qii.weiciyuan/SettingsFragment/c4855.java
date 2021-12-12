diff --git a/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java b/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
index 253c183..c2b5276 100644
--- a/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
+++ b/src/org/qii/weiciyuan/ui/preference/SettingsFragment.java
@@ -118,7 +118,7 @@
         }
 
         if (key.equals(SettingActivity.SHOW_BIG_PIC)) {
-            boolean value = sharedPreferences.getBoolean(key, true);
+            boolean value = sharedPreferences.getBoolean(key, false);
             GlobalContext.getInstance().setEnableBigPic(value);
         }
     }
