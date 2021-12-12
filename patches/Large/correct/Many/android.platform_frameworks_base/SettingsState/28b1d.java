diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
index dde9709..b61d23c 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsState.java
@@ -560,7 +560,7 @@
         }
 
         public Setting(String name, String value, String packageName, String id) {
-            mNextId = Math.max(mNextId, Long.valueOf(id) + 1);
+            mNextId = Math.max(mNextId, Long.parseLong(id) + 1);
             init(name, value, packageName, id);
         }
 
