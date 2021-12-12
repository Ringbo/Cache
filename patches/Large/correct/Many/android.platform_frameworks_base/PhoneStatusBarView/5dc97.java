diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBarView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBarView.java
index 2b610e4..701c57f 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBarView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBarView.java
@@ -78,7 +78,7 @@
 
     @Override
     public boolean onRequestSendAccessibilityEventInternal(View child, AccessibilityEvent event) {
-        if (super.onRequestSendAccessibilityEvent(child, event)) {
+        if (super.onRequestSendAccessibilityEventInternal(child, event)) {
             // The status bar is very small so augment the view that the user is touching
             // with the content of the status bar a whole. This way an accessibility service
             // may announce the current item as well as the entire content if appropriate.
