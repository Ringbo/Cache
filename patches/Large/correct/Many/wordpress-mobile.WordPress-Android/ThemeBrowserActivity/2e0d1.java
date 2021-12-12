diff --git a/src/org/wordpress/android/ui/themes/ThemeBrowserActivity.java b/src/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
index 5544b79..585db1b 100644
--- a/src/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
+++ b/src/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
@@ -245,7 +245,7 @@
     @Override
     public void onBackPressed() {
         FragmentManager fm = getSupportFragmentManager();
-        if (mMenuDrawer.isShown()) {
+        if (mMenuDrawer.isMenuVisible()) {
             super.onBackPressed();
         } else if (fm.getBackStackEntryCount() > 0) {
             fm.popBackStack();
