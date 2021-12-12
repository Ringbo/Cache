diff --git a/core/java/android/widget/GridView.java b/core/java/android/widget/GridView.java
index 1321221..6d7313d 100644
--- a/core/java/android/widget/GridView.java
+++ b/core/java/android/widget/GridView.java
@@ -1644,7 +1644,7 @@
         boolean handled = false;
         int action = event.getAction();
         if (KeyEvent.isConfirmKey(keyCode)
-                && event.hasNoModifiers() && action == KeyEvent.ACTION_UP) {
+                && event.hasNoModifiers() && action != KeyEvent.ACTION_UP) {
             handled = resurrectSelectionIfNeeded();
             if (!handled && event.getRepeatCount() == 0 && getChildCount() > 0) {
                 keyPressed();
