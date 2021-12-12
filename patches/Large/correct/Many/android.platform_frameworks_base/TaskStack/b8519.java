diff --git a/services/core/java/com/android/server/wm/TaskStack.java b/services/core/java/com/android/server/wm/TaskStack.java
index 9b3d478..df664bd 100644
--- a/services/core/java/com/android/server/wm/TaskStack.java
+++ b/services/core/java/com/android/server/wm/TaskStack.java
@@ -409,7 +409,7 @@
             final boolean dockedOnTopOrLeft = WindowManagerService.sDockedStackCreateMode
                     == DOCKED_STACK_CREATE_MODE_TOP_OR_LEFT;
             getStackDockedModeBounds(mTmpRect, bounds, mStackId, mTmpRect2,
-                    mDisplayContent.mDividerControllerLocked.getWidthAdjustment(),
+                    mDisplayContent.mDividerControllerLocked.getWidth(),
                     dockedOnTopOrLeft);
         }
 
@@ -459,7 +459,7 @@
         dockedStack.getRawBounds(mTmpRect2);
         final boolean dockedOnTopOrLeft = dockedSide == DOCKED_TOP || dockedSide == DOCKED_LEFT;
         getStackDockedModeBounds(mTmpRect, outBounds, mStackId, mTmpRect2,
-                mDisplayContent.mDividerControllerLocked.getWidthAdjustment(), dockedOnTopOrLeft);
+                mDisplayContent.mDividerControllerLocked.getWidth(), dockedOnTopOrLeft);
 
     }
 
@@ -469,13 +469,13 @@
      * @param outBounds Output bounds that should be used for the stack.
      * @param stackId Id of stack we are calculating the bounds for.
      * @param dockedBounds Bounds of the docked stack.
-     * @param adjustment Additional adjustment to make to the output bounds close to the side of the
-     *                   dock.
-     * @param dockOntopOrLeft If the docked stack is on the top or left side of the screen.
+     * @param dockDividerWidth We need to know the width of the divider make to the output bounds
+     *                         close to the side of the dock.
+     * @param dockOnTopOrLeft If the docked stack is on the top or left side of the screen.
      */
     private static void getStackDockedModeBounds(
-            Rect displayRect, Rect outBounds, int stackId, Rect dockedBounds, int adjustment,
-            boolean dockOntopOrLeft) {
+            Rect displayRect, Rect outBounds, int stackId, Rect dockedBounds, int dockDividerWidth,
+            boolean dockOnTopOrLeft) {
         final boolean dockedStack = stackId == DOCKED_STACK_ID;
         final boolean splitHorizontally = displayRect.width() > displayRect.height();
 
@@ -484,34 +484,34 @@
             // The initial bounds of the docked stack when it is created half the screen space and
             // its bounds can be adjusted after that. The bounds of all other stacks are adjusted
             // to occupy whatever screen space the docked stack isn't occupying.
-            if (dockOntopOrLeft) {
+            if (dockOnTopOrLeft) {
                 if (splitHorizontally) {
-                    outBounds.right = displayRect.centerX() - adjustment;
+                    outBounds.right = displayRect.centerX() - dockDividerWidth / 2;
                 } else {
-                    outBounds.bottom = displayRect.centerY() - adjustment;
+                    outBounds.bottom = displayRect.centerY() - dockDividerWidth / 2;
                 }
             } else {
                 if (splitHorizontally) {
-                    outBounds.left = displayRect.centerX() + adjustment;
+                    outBounds.left = displayRect.centerX() + dockDividerWidth / 2;
                 } else {
-                    outBounds.top = displayRect.centerY() + adjustment;
+                    outBounds.top = displayRect.centerY() + dockDividerWidth / 2;
                 }
             }
             return;
         }
 
         // Other stacks occupy whatever space is left by the docked stack.
-        if (!dockOntopOrLeft) {
+        if (!dockOnTopOrLeft) {
             if (splitHorizontally) {
-                outBounds.right = dockedBounds.left - adjustment;
+                outBounds.right = dockedBounds.left - dockDividerWidth;
             } else {
-                outBounds.bottom = dockedBounds.top - adjustment;
+                outBounds.bottom = dockedBounds.top - dockDividerWidth;
             }
         } else {
             if (splitHorizontally) {
-                outBounds.left = dockedBounds.right + adjustment;
+                outBounds.left = dockedBounds.right + dockDividerWidth;
             } else {
-                outBounds.top = dockedBounds.bottom + adjustment;
+                outBounds.top = dockedBounds.bottom + dockDividerWidth;
             }
         }
     }
