diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
index fbeeebc..5a83a82 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
@@ -159,7 +159,7 @@
     protected void addSyncRefreshMenuItem(Menu menu, int themeFlags) {
         if(actFmPreferenceService.isLoggedIn()) {
             addMenuItem(menu, R.string.actfm_TVA_menu_refresh,
-                    ThemeService.getDrawable(R.drawable.icn_menu_refresh, themeFlags), MENU_REFRESH_ID, false);
+                    ThemeService.getDrawable(R.drawable.icn_menu_refresh, themeFlags), MENU_REFRESH_ID, true);
         } else {
             super.addSyncRefreshMenuItem(menu, themeFlags);
         }
