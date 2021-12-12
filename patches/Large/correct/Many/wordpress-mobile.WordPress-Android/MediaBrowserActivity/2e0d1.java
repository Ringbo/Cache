diff --git a/src/org/wordpress/android/ui/media/MediaBrowserActivity.java b/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
index bf55e52..1c3f30f 100644
--- a/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
+++ b/src/org/wordpress/android/ui/media/MediaBrowserActivity.java
@@ -469,7 +469,7 @@
     @Override
     public void onBackPressed() {
         FragmentManager fm = getSupportFragmentManager();
-        if (mMenuDrawer.isShown()) {
+        if (mMenuDrawer.isMenuVisible()) {
             super.onBackPressed();
         } else if (isInMultiSelect()) {
             cancelMultiSelect();
