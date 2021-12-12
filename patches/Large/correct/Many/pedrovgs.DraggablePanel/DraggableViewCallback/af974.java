diff --git a/draggablepanel/src/main/java/com/github/pedrovgs/DraggableViewCallback.java b/draggablepanel/src/main/java/com/github/pedrovgs/DraggableViewCallback.java
index 1c2a69a..361a3ee 100644
--- a/draggablepanel/src/main/java/com/github/pedrovgs/DraggableViewCallback.java
+++ b/draggablepanel/src/main/java/com/github/pedrovgs/DraggableViewCallback.java
@@ -165,7 +165,7 @@
      * @param xVel
      */
     private void triggerOnReleaseActionsWhileHorizontalDrag(float xVel) {
-        if (xVel < 0 && xVel <= X_MIN_VELOCITY) {
+        if (xVel < 0 && xVel <= -X_MIN_VELOCITY) {
             draggableView.closeToLeft();
         } else if (xVel > 0 && xVel >= X_MIN_VELOCITY) {
             draggableView.closeToRight();
