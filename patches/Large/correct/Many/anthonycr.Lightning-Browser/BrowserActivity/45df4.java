diff --git a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
index b6a6161..b4eb3b2 100644
--- a/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
+++ b/app/src/main/java/acr/browser/lightning/activity/BrowserActivity.java
@@ -1242,7 +1242,7 @@
 
     @Override
     public void updateTabNumber(int number) {
-        if (mArrowImage != null) {
+        if (mArrowImage != null && mShowTabsInDrawer) {
             mArrowImage.setImageBitmap(DrawableUtils.getRoundedNumberImage(number, Utils.dpToPx(24),
                     Utils.dpToPx(24), ThemeUtils.getIconThemeColor(this, mDarkTheme), Utils.dpToPx(2.5f)));
         }
