diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
index b6a81b8..531126d 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickSettingsModel.java
@@ -393,7 +393,7 @@
                 mInversionObserver.startObserving();
                 mContrastObserver.startObserving();
                 mColorSpaceObserver.startObserving();
-                onRotationLockChanged();
+                refreshRotationLockTile();
                 onBrightnessLevelChanged();
                 onInversionChanged();
                 onContrastChanged();
