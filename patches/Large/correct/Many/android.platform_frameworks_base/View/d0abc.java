diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 12658bd..0174afc 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -11322,7 +11322,10 @@
                 && isOnScrollbar(event.getX(), event.getY())) {
             awakenScrollBars();
         }
-        if (isHoverable()) {
+
+        // If we consider ourself hoverable, or if we we're already hovered,
+        // handle changing state in response to ENTER and EXIT events.
+        if (isHoverable() || isHovered()) {
             switch (action) {
                 case MotionEvent.ACTION_HOVER_ENTER:
                     setHovered(true);
