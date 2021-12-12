diff --git a/core/java/android/widget/GridView.java b/core/java/android/widget/GridView.java
index ee73092..f3e77fc 100644
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
