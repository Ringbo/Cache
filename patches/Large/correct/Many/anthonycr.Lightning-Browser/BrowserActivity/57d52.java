diff --git a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
index ec45343..3f9eba1 100644
--- a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
+++ b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
@@ -316,8 +316,8 @@
         final FragmentManager fragmentManager = getSupportFragmentManager();
         fragmentManager
                 .beginTransaction()
-                .add(containerId, tabsFragment)
-                .add(R.id.right_drawer, bookmarksFragment)
+                .replace(containerId, tabsFragment)
+                .replace(R.id.right_drawer, bookmarksFragment)
                 .commit();
         if (mShowTabsInDrawer) {
             mToolbarLayout.removeView(findViewById(R.id.tabs_toolbar_container));
