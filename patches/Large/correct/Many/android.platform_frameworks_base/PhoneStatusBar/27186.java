diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index 7bb8277..25eab26 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -1873,7 +1873,7 @@
     }
 
     void updateExpandedSize() {
-        if (mExpandedDialog != null) {
+        if (mExpandedDialog != null && mExpandedParams != null) {
             mExpandedParams.width = mDisplaySize.x;
             mExpandedParams.height = getExpandedHeight(mDisplaySize.y);
             if (!mExpandedVisible) {
