diff --git a/astrid/plugin-src/com/todoroo/astrid/subtasks/SubtasksTagListFragment.java b/astrid/plugin-src/com/todoroo/astrid/subtasks/SubtasksTagListFragment.java
index acb1935..142c1bc 100644
--- a/astrid/plugin-src/com/todoroo/astrid/subtasks/SubtasksTagListFragment.java
+++ b/astrid/plugin-src/com/todoroo/astrid/subtasks/SubtasksTagListFragment.java
@@ -69,7 +69,7 @@
     @Override
     public void onResume() {
         super.onResume();
-        if (lastVisibleIndex >=0) {
+        if (lastVisibleIndex >= 0 && !justDeleted) {
             getListView().setSelection(lastVisibleIndex);
         }
     }
