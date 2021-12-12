diff --git a/packages/SettingsLib/src/com/android/settingslib/drawer/SettingsDrawerActivity.java b/packages/SettingsLib/src/com/android/settingslib/drawer/SettingsDrawerActivity.java
index 2ef776d..5ffa581 100644
--- a/packages/SettingsLib/src/com/android/settingslib/drawer/SettingsDrawerActivity.java
+++ b/packages/SettingsLib/src/com/android/settingslib/drawer/SettingsDrawerActivity.java
@@ -142,7 +142,7 @@
     }
 
     public void setIsDrawerPresent(boolean isPresent) {
-        if (isVisible) {
+        if (isPresent) {
             mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
             updateDrawer();
         } else {
