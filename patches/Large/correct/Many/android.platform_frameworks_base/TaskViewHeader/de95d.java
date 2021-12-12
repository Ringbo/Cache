diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java b/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
index dc666e9..311f8ff 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
@@ -524,7 +524,7 @@
      * changes.
      */
     public void onTaskDataLoaded() {
-        if (mTask.icon != null) {
+        if (mTask != null && mTask.icon != null) {
             mIconView.setImageDrawable(mTask.icon);
         }
     }
