diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 064808b..a11897d 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -2181,7 +2181,7 @@
         boolean handled = false;
         int action = event.getAction();
         if (KeyEvent.isConfirmKey(keyCode)
-                && event.hasNoModifiers() && action == KeyEvent.ACTION_UP) {
+                && event.hasNoModifiers() && action != KeyEvent.ACTION_UP) {
             handled = resurrectSelectionIfNeeded();
             if (!handled && event.getRepeatCount() == 0 && getChildCount() > 0) {
                 keyPressed();
