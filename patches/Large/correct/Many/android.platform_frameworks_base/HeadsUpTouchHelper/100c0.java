diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/HeadsUpTouchHelper.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/HeadsUpTouchHelper.java
index fe7bc97..3eb6b13 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/HeadsUpTouchHelper.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/HeadsUpTouchHelper.java
@@ -75,7 +75,7 @@
                 mInitialTouchY = y;
                 mInitialTouchX = x;
                 setTrackingHeadsUp(false);
-                ExpandableView child = mStackScroller.getChildAtPosition(x, y);
+                ExpandableView child = mStackScroller.getChildAtRawPosition(x, y);
                 mTouchingHeadsUpView = false;
                 if (child instanceof ExpandableNotificationRow) {
                     mPickedChild = (ExpandableNotificationRow) child;
