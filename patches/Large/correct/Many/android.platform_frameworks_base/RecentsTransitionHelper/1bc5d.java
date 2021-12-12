diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
index a28601b..85b8fcf 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsTransitionHelper.java
@@ -270,7 +270,7 @@
         int taskCount = tasks.size();
         for (int i = taskCount - 1; i >= 0; i--) {
             Task t = tasks.get(i);
-            if (t.isFreeformTask()) {
+            if (t.isFreeformTask() || targetStackId == FREEFORM_WORKSPACE_STACK_ID) {
                 TaskView tv = stackView.getChildViewForTask(t);
                 if (tv == null) {
                     // TODO: Create a different animation task rect for this case (though it should
