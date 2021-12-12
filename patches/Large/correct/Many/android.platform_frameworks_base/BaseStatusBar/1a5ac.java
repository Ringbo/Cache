diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
index 2b6ac26..3392d8e 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/BaseStatusBar.java
@@ -1549,7 +1549,11 @@
             dismissKeyguardThenExecute(new OnDismissAction() {
                 public boolean onDismiss() {
                     if (mIsHeadsUp) {
-                        mHeadsUpNotificationView.clear();
+                        // Release the HUN notification to the shade.
+                        //
+                        // In most cases, when FLAG_AUTO_CANCEL is set, the notification will
+                        // become canceled shortly by NoMan, but we can't assume that.
+                        mHeadsUpNotificationView.releaseAndClose();
                     }
                     new Thread() {
                         @Override
