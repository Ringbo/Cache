diff --git a/src/org/qii/weiciyuan/support/utils/GlobalContext.java b/src/org/qii/weiciyuan/support/utils/GlobalContext.java
index d6a9d75..bd24844 100644
--- a/src/org/qii/weiciyuan/support/utils/GlobalContext.java
+++ b/src/org/qii/weiciyuan/support/utils/GlobalContext.java
@@ -137,7 +137,7 @@
         } else {
             AppLogger.e("GlobalContext is empty by system");
             SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
-            enableBigPic = sharedPref.getBoolean(SettingActivity.SHOW_BIG_PIC, true);
+            enableBigPic = sharedPref.getBoolean(SettingActivity.SHOW_BIG_PIC, false);
             return enableBigPic;
         }
 
