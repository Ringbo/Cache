diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
index 3a9b068..6d8b08f 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsProvider.java
@@ -252,7 +252,8 @@
                 if (!DatabaseHelper.isValidTable(this.table)) {
                     throw new IllegalArgumentException("Bad root path: " + this.table);
                 }
-                if (TABLE_SYSTEM.equals(this.table) || TABLE_SECURE.equals(this.table)) {
+                if (TABLE_SYSTEM.equals(this.table) || TABLE_SECURE.equals(this.table) ||
+                    TABLE_GLOBAL.equals(this.table)) {
                     this.where = Settings.NameValueTable.NAME + "=?";
                     this.args = new String[] { url.getPathSegments().get(1) };
                 } else {
