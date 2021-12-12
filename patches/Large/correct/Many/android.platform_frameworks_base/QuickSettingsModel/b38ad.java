diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
index 2026102..15d655c 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
@@ -280,7 +280,7 @@
         mUserTracker = new CurrentUserTracker(mContext) {
             public void onUserSwitched(int newUserId) {
                 mBrightnessObserver.startObserving();
-                onRotationLockChanged();
+                refreshRotationLockTile();
                 onBrightnessLevelChanged();
                 onNextAlarmChanged();
                 onBugreportChanged();
