diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
index 95d7772..708cf68 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
@@ -563,7 +563,7 @@
         }
 
         public Setting(String name, String value, String packageName, String id) {
-            mNextId = Math.max(mNextId, Long.valueOf(id) + 1);
+            mNextId = Math.max(mNextId, Long.parseLong(id) + 1);
             init(name, value, packageName, id);
         }
 
