diff --git a/services/core/java/com/android/server/wm/DockedStackDividerController.java b/services/core/java/com/android/server/wm/DockedStackDividerController.java
index c8baced..39a3629 100644
--- a/services/core/java/com/android/server/wm/DockedStackDividerController.java
+++ b/services/core/java/com/android/server/wm/DockedStackDividerController.java
@@ -408,7 +408,7 @@
     }
 
     void positionDockedStackedDivider(Rect frame) {
-        TaskStack stack = mDisplayContent.getSplitScreenPrimaryStack();
+        TaskStack stack = mDisplayContent.getSplitScreenPrimaryStackIgnoringVisibility();
         if (stack == null) {
             // Unfortunately we might end up with still having a divider, even though the underlying
             // stack was already removed. This is because we are on AM thread and the removal of the
