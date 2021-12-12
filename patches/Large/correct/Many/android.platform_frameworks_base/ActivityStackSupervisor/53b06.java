diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index f546c1d..38feb2b 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -1803,8 +1803,11 @@
                 return container.mStack;
             }
 
-            if (mFocusedStack != mHomeStack && (!newTask ||
-                    mFocusedStack.mActivityContainer.isEligibleForNewTasks())) {
+            // The fullscreen stack is the only stack that can contain any task regardless of if
+            // the task is resizeable or not. So, we let the task go in the fullscreen task if it
+            // is the focus stack.
+            if (mFocusedStack.mStackId == FULLSCREEN_WORKSPACE_STACK_ID
+                    && (!newTask || mFocusedStack.mActivityContainer.isEligibleForNewTasks())) {
                 if (DEBUG_FOCUS || DEBUG_STACK) Slog.d(TAG_FOCUS,
                         "computeStackFocus: Have a focused stack=" + mFocusedStack);
                 return mFocusedStack;
@@ -1823,7 +1826,7 @@
             }
 
             // If there is no suitable dynamic stack then we figure out which static stack to use.
-            int stackId = task != null ? task.getLaunchStackId() :
+            final int stackId = task != null ? task.getLaunchStackId() :
                         bounds != null ? FREEFORM_WORKSPACE_STACK_ID :
                                          FULLSCREEN_WORKSPACE_STACK_ID;
             stack = getStack(stackId, CREATE_IF_NEEDED, ON_TOP);
