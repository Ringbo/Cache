diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarGestureHelper.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarGestureHelper.java
index 57d78dd..320b56f 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarGestureHelper.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarGestureHelper.java
@@ -149,7 +149,7 @@
     }
 
     public boolean onInterceptTouchEvent(MotionEvent event) {
-        if (mNavigationBarView.inScreenPinning()) {
+        if (mNavigationBarView.inScreenPinning() || mStatusBar.isKeyguardShowing()) {
             return false;
         }
 
@@ -182,7 +182,7 @@
     }
 
     public boolean onTouchEvent(MotionEvent event) {
-        if (mNavigationBarView.inScreenPinning()) {
+        if (mNavigationBarView.inScreenPinning() || mStatusBar.isKeyguardShowing()) {
             return false;
         }
 
