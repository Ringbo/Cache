diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
index 0550771..ca1f75c 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
@@ -267,7 +267,7 @@
                             // preventing spurious flings due to touch screen jitter
                             final float deltaY = Math.abs(mFinalTouchY - mInitialTouchY);
                             if (deltaY < mFlingGestureMinDistPx
-                                    || vel < mFlingGestureMinDistPx) {
+                                    || vel < mFlingExpandMinVelocityPx) {
                                 vel = 0;
                             }
 
