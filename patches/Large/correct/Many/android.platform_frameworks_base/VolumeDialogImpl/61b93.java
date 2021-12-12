diff --git a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
index 6f71e55..13157fe 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/VolumeDialogImpl.java
@@ -213,7 +213,7 @@
                     .setInterpolator(new SystemUIInterpolators.LogDecelerateInterpolator())
                     .withEndAction(() -> {
                         mWindow.getDecorView().requestAccessibilityFocus();
-                        if (!Prefs.getBoolean(mContext, Prefs.Key.TOUCHED_RINGER_TOGGLE, true)) {
+                        if (!Prefs.getBoolean(mContext, Prefs.Key.TOUCHED_RINGER_TOGGLE, false)) {
                             mRingerIcon.postOnAnimationDelayed(mSinglePress, 1500);
                         }
                     })
