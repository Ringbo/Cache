diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
index 46f9c04..afe5c91 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
@@ -404,8 +404,8 @@
                 false /* collapseWhenFinished */);
         notifyBarPanelExpansionChanged();
         if (mVibrateOnOpening && !isHapticFeedbackDisabled(mContext)) {
-            AsyncTask.execute(
-                    () -> mVibrator.vibrate(VibrationEffect.get(VibrationEffect.EFFECT_TICK)));
+            AsyncTask.execute(() ->
+                    mVibrator.vibrate(VibrationEffect.get(VibrationEffect.EFFECT_TICK, false)));
         }
     }
 
