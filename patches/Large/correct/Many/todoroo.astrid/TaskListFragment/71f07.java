diff --git a/astrid/src/com/todoroo/astrid/activity/TaskListFragment.java b/astrid/src/com/todoroo/astrid/activity/TaskListFragment.java
index 27584ca..59ae645 100644
--- a/astrid/src/com/todoroo/astrid/activity/TaskListFragment.java
+++ b/astrid/src/com/todoroo/astrid/activity/TaskListFragment.java
@@ -1210,7 +1210,7 @@
             if(manualSettingChanged)
                 toggleDragDrop(SortHelper.isManualSort(sortFlags));
             else
-                loadTaskListContent(true);
+                setUpTaskList();
         } catch (IllegalStateException e) {
             // TODO: Fragment got detached somehow (rare)
         }
