diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
index 0165977..1096540 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
@@ -563,7 +563,7 @@
                 getContentResolver().insert(contentUri, contentValues);
             }
 
-            if (DEBUG) {
+            if (DEBUG || true) {
                 Log.d(TAG, "Restored setting: " + key + "=" + value);
             }
         }
