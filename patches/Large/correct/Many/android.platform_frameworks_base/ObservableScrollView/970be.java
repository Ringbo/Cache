diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ObservableScrollView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ObservableScrollView.java
index 1186a33..9e5cefd 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/ObservableScrollView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/ObservableScrollView.java
@@ -99,7 +99,7 @@
         } else if (!mTouchEnabled) {
             MotionEvent cancel = MotionEvent.obtain(ev);
             cancel.setAction(MotionEvent.ACTION_CANCEL);
-            super.dispatchTouchEvent(ev);
+            super.dispatchTouchEvent(cancel);
             cancel.recycle();
             mTouchCancelled = true;
             return false;
