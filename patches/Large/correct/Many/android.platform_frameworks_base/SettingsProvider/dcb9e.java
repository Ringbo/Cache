diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
index 1dba942..5137e1b 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
@@ -516,7 +516,7 @@
     }
 
     private void dumpSettings(Cursor cursor, PrintWriter pw) {
-        if (!cursor.moveToFirst()) {
+        if (cursor == null || !cursor.moveToFirst()) {
             return;
         }
 
