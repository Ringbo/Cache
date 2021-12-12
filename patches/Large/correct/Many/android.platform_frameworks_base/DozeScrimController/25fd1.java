diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeScrimController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeScrimController.java
index f06dd7b..021b451 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeScrimController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DozeScrimController.java
@@ -304,7 +304,7 @@
             mHandler.removeCallbacks(mSetDozeInFrontAlphaDelayed);
             mSetDozeInFrontAlphaDelayed = null;
         }
-        if (delayMs < 0) {
+        if (delayMs <= 0) {
             mScrimController.setDozeInFrontAlpha(opacity);
         } else {
             mHandler.postDelayed(mSetDozeInFrontAlphaDelayed = () -> {
