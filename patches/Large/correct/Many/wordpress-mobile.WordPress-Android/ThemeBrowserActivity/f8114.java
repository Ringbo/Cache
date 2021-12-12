diff --git a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
index d4ccbc3..d99eca6 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
@@ -424,7 +424,7 @@
         String toastText = getString(R.string.no_network_message);
 
         if (NetworkUtils.isNetworkAvailable(this)) {
-            ThemeModel theme = TextUtils.isEmpty(themeId) ? null : mThemeStore.getThemeByThemeId(themeId);
+            ThemeModel theme = TextUtils.isEmpty(themeId) ? null : mThemeStore.getWpComThemeByThemeId(themeId);
             if (theme != null) {
                 Map<String, Object> themeProperties = new HashMap<>();
                 themeProperties.put(THEME_ID, themeId);
