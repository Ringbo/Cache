diff --git a/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksListFragment.java b/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksListFragment.java
index 379fa84..377441c 100644
--- a/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksListFragment.java
+++ b/astrid/plugin-src/com/todoroo/astrid/gtasks/GtasksListFragment.java
@@ -148,7 +148,7 @@
     protected void addSyncRefreshMenuItem(Menu menu, int themeFlags) {
         if(gtasksPreferenceService.isLoggedIn()) {
             addMenuItem(menu, R.string.actfm_TVA_menu_refresh,
-                    ThemeService.getDrawable(R.drawable.icn_menu_refresh, themeFlags), MENU_REFRESH_ID, false);
+                    ThemeService.getDrawable(R.drawable.icn_menu_refresh, themeFlags), MENU_REFRESH_ID, true);
         } else {
             super.addSyncRefreshMenuItem(menu, themeFlags);
         }
