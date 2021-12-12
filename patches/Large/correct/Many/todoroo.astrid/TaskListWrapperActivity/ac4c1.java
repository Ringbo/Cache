diff --git a/astrid/src/com/todoroo/astrid/activity/TaskListWrapperActivity.java b/astrid/src/com/todoroo/astrid/activity/TaskListWrapperActivity.java
index 5a4535f..1e9f91d 100644
--- a/astrid/src/com/todoroo/astrid/activity/TaskListWrapperActivity.java
+++ b/astrid/src/com/todoroo/astrid/activity/TaskListWrapperActivity.java
@@ -105,7 +105,7 @@
             public void onDismiss() {
                 TaskEditActivity tea = getTaskEditFragment();
                 if (tea != null)
-                    tea.save(false);
+                    tea.save(true);
             }
         });
     }
