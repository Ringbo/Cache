diff --git a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
index 987598a..0e56aae 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
@@ -407,7 +407,7 @@
         String toastText = getString(R.string.no_network_message);
 
         if (NetworkUtils.isNetworkAvailable(this)) {
-            if (mCurrentTheme != null) {
+            if (mCurrentTheme != null && (themeId != null || !themeId.isEmpty())) {
                 boolean isCurrentTheme = mCurrentTheme.getId().equals(themeId);
                 Map<String, Object> themeProperties = new HashMap<>();
                 themeProperties.put(THEME_ID, themeId);
