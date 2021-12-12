diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
index d99f741..e74334b 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
@@ -447,8 +447,10 @@
                     Settings.Global.putInt(cr,
                             Settings.Global.WIFI_SCAN_ALWAYS_AVAILABLE, 0);
                 }
-                // !!! Give the wifi stack a moment to quiesce
-                try { Thread.sleep(1500); } catch (InterruptedException e) {}
+                // !!! Give the wifi stack a moment to quiesce.  We've observed the
+                // response to disabling WIFI_SCAN_ALWAYS_AVAILABLE taking more
+                // than 1500ms, so we wait a generous 2500 here before proceeding.
+                try { Thread.sleep(2500); } catch (InterruptedException e) {}
                 if (restoredSupplicantData != null) {
                     restoreWifiSupplicant(FILE_WIFI_SUPPLICANT,
                             restoredSupplicantData, restoredSupplicantData.length);
