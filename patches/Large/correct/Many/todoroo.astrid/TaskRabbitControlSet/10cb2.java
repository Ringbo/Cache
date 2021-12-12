diff --git a/astrid/plugin-src/com/todoroo/astrid/taskrabbit/TaskRabbitControlSet.java b/astrid/plugin-src/com/todoroo/astrid/taskrabbit/TaskRabbitControlSet.java
index de95fcf..43938a2 100644
--- a/astrid/plugin-src/com/todoroo/astrid/taskrabbit/TaskRabbitControlSet.java
+++ b/astrid/plugin-src/com/todoroo/astrid/taskrabbit/TaskRabbitControlSet.java
@@ -212,7 +212,7 @@
             statusText.setText(status);
             getDisplayView().setVisibility(View.VISIBLE);
         }
-        else if (taskRabbitTask.getLocalTaskData() != null) {
+        else if (taskRabbitTask != null && taskRabbitTask.getLocalTaskData() != null) {
             TextView statusText = (TextView) getDisplayView().findViewById(R.id.display_row_edit);
             statusText.setText(fragment.getActivity().getString(R.string.tr_status_draft));
             getDisplayView().setVisibility(View.VISIBLE);
