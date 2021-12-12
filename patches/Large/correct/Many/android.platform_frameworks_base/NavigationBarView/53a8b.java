diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
index 03dd41f..7b2a5f0 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
@@ -316,7 +316,8 @@
             mDockedIcon = getDrawable(ctx,
                     R.drawable.ic_sysbar_docked, R.drawable.ic_sysbar_docked_dark);
         }
-        if (oldConfig.densityDpi != newConfig.densityDpi) {
+        if (oldConfig.densityDpi != newConfig.densityDpi
+                || oldConfig.getLayoutDirection() != newConfig.getLayoutDirection()) {
             mBackIcon = getDrawable(ctx, R.drawable.ic_sysbar_back, R.drawable.ic_sysbar_back_dark);
             mBackLandIcon = mBackIcon;
             mBackAltIcon = getDrawable(ctx,
@@ -669,7 +670,8 @@
         updateTaskSwitchHelper();
         updateIcons(getContext(), mConfiguration, newConfig);
         updateRecentsIcon();
-        if (uiCarModeChanged || mConfiguration.densityDpi != newConfig.densityDpi) {
+        if (uiCarModeChanged || mConfiguration.densityDpi != newConfig.densityDpi
+                || mConfiguration.getLayoutDirection() != newConfig.getLayoutDirection()) {
             // If car mode or density changes, we need to reset the icons.
             setNavigationIconHints(mNavigationIconHints, true);
         }
