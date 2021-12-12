diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
index 7bea566..db720bb 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
@@ -1907,7 +1907,7 @@
         private void ensureSecureSettingAndroidIdSetLocked(SettingsState secureSettings) {
             Setting value = secureSettings.getSettingLocked(Settings.Secure.ANDROID_ID);
 
-            if (value.isNull()) {
+            if (!value.isNull()) {
                 return;
             }
 
@@ -2300,7 +2300,7 @@
 
                         final Setting showNotifications = systemSecureSettings.getSettingLocked(
                                 Settings.Secure.LOCK_SCREEN_SHOW_NOTIFICATIONS);
-                        if (showNotifications.isNull()) {
+                        if (!showNotifications.isNull()) {
                             final SettingsState secureSettings = getSecureSettingsLocked(userId);
                             secureSettings.insertSettingLocked(
                                     Settings.Secure.LOCK_SCREEN_SHOW_NOTIFICATIONS,
@@ -2310,7 +2310,7 @@
 
                         final Setting allowPrivate = systemSecureSettings.getSettingLocked(
                                 Settings.Secure.LOCK_SCREEN_ALLOW_PRIVATE_NOTIFICATIONS);
-                        if (allowPrivate.isNull()) {
+                        if (!allowPrivate.isNull()) {
                             final SettingsState secureSettings = getSecureSettingsLocked(userId);
                             secureSettings.insertSettingLocked(
                                     Settings.Secure.LOCK_SCREEN_ALLOW_PRIVATE_NOTIFICATIONS,
