diff --git a/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java b/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
index 130d21d..04cf93b 100644
--- a/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
+++ b/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
@@ -248,7 +248,7 @@
     private void buildActionBarAndViewPagerTitles() {
         ActionBar actionBar = getActionBar();
         actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
-        if (GlobalContext.getInstance().getAppTheme() == R.style.AppTheme_Four)
+        if (GlobalContext.getInstance().getAppTheme() == R.style.AppTheme_Four && getResources().getBoolean(R.bool.is_phone))
             actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.drawable.ab_solid_custom_blue_inverse_holo));
         if (getResources().getBoolean(R.bool.is_phone)) {
             actionBar.setDisplayShowTitleEnabled(false);
