diff --git a/packages/SettingsProvider/src/com/android/providers/settings/DatabaseHelper.java b/packages/SettingsProvider/src/com/android/providers/settings/DatabaseHelper.java
index 835c683..6a1f6f8 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/DatabaseHelper.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/DatabaseHelper.java
@@ -432,7 +432,7 @@
             } finally {
                 db.endTransaction();
             }
-            upgradeVersion = 36;
+            upgradeVersion = 37;
         }
 
         if (upgradeVersion == 37) {
