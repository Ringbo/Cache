diff --git a/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java b/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
index f47192c..5930b94 100644
--- a/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
+++ b/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
@@ -483,7 +483,7 @@
             if (newList != null) {
                 onFilterItemClicked(newList); // Switch to the new list
                 FilterListFragment fla = getFilterListFragment();
-                if (fla != null)
+                if (fla != null && getFragmentLayout() != LAYOUT_SINGLE)
                     fla.clear();
             }
         } else if (requestCode == TaskListFragment.ACTIVITY_EDIT_TASK && resultCode != Activity.RESULT_CANCELED) {
