diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/grid/TaskGridLayoutAlgorithm.java b/packages/SystemUI/src/com/android/systemui/recents/views/grid/TaskGridLayoutAlgorithm.java
index be3af040..fa8e943 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/grid/TaskGridLayoutAlgorithm.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/grid/TaskGridLayoutAlgorithm.java
@@ -145,8 +145,11 @@
         int y = gridInfo.yOffsets[taskIndex];
         float z = stackLayout.mMaxTranslationZ;
 
+        // We always set the dim alpha to 0, since we don't want grid task views to dim.
         float dimAlpha = 0f;
-        float viewOutlineAlpha = 0f;
+        // We always set the alpha of the view outline to 1, to make sure the shadow is visible.
+        float viewOutlineAlpha = 1f;
+
         // We also need to invert the index in order to display the most recent tasks first.
         int taskLayoutIndex = taskCount - taskIndex - 1;
         boolean isTaskViewVisible = (taskLayoutIndex < MAX_LAYOUT_TASK_COUNT);
