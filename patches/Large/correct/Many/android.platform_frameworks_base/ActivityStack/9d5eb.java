diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 9fb3e11..e86850e 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -515,11 +515,11 @@
     @Override
     public void setWindowingMode(int windowingMode) {
         setWindowingMode(windowingMode, false /* animate */, false /* showRecents */,
-                false /* enteringSplitScreenMode */);
+                false /* enteringSplitScreenMode */, false /* deferEnsuringVisibility */);
     }
 
     void setWindowingMode(int preferredWindowingMode, boolean animate, boolean showRecents,
-            boolean enteringSplitScreenMode) {
+            boolean enteringSplitScreenMode, boolean deferEnsuringVisibility) {
         final boolean creating = mWindowContainerController == null;
         final int currentMode = getWindowingMode();
         final ActivityDisplay display = getDisplay();
@@ -555,7 +555,9 @@
                 // doesn't support split-screen mode, go ahead an dismiss split-screen and display a
                 // warning toast about it.
                 mService.mTaskChangeNotificationController.notifyActivityDismissingDockedStack();
-                display.getSplitScreenPrimaryStack().setWindowingMode(WINDOWING_MODE_FULLSCREEN);
+                display.getSplitScreenPrimaryStack().setWindowingMode(WINDOWING_MODE_FULLSCREEN,
+                        false /* animate */, false /* showRecents */,
+                        false /* enteringSplitScreenMode */, true /* deferEnsuringVisibility */);
             }
         }
 
@@ -646,9 +648,7 @@
             wm.continueSurfaceLayout();
         }
 
-        // Don't ensure visible activities if the windowing mode change was a side effect of us
-        // entering split-screen mode.
-        if (!enteringSplitScreenMode) {
+        if (!deferEnsuringVisibility) {
             mStackSupervisor.ensureActivitiesVisibleLocked(null, 0, PRESERVE_WINDOWS);
             mStackSupervisor.resumeFocusedStackTopActivityLocked();
         }
