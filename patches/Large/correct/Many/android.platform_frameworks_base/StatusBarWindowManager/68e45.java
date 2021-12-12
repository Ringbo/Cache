diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarWindowManager.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarWindowManager.java
index 93dc6de..6104bef 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarWindowManager.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarWindowManager.java
@@ -138,7 +138,7 @@
     }
 
     private void adjustScreenOrientation(State state) {
-        if (state.isKeyguardShowingAndNotOccluded()) {
+        if (state.isKeyguardShowingAndNotOccluded() || state.dozing) {
             if (mKeyguardScreenRotation) {
                 mLpChanged.screenOrientation = ActivityInfo.SCREEN_ORIENTATION_USER;
             } else {
