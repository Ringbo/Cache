diff --git a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
index 264c89b..8928421 100644
--- a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
+++ b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
@@ -294,7 +294,7 @@
             } else if(task.isCompleted()) {
                 String dateValue = formatDate(task.getValue(Task.COMPLETION_DATE));
                 dueDateView.setText(r.getString(R.string.TAd_completed, dateValue));
-                dueDateView.setTextAppearance(activity, R.style.TextAppearance_TAd_ItemDetails);
+                dueDateView.setTextAppearance(activity, R.style.TextAppearance_TAd_ItemDueDate_Completed);
                 setVisibility(dueDateView);
             } else {
                 dueDateView.setVisibility(View.GONE);
@@ -325,7 +325,7 @@
             details = taskDetailLoader.get(task.getId()).toString();
         else
             details = task.getValue(Task.DETAILS);
-        if(TextUtils.isEmpty(details) || DETAIL_SEPARATOR.equals(details)) {
+        if(TextUtils.isEmpty(details) || DETAIL_SEPARATOR.equals(details) || task.isCompleted()) {
             viewHolder.details.setVisibility(View.GONE);
         } else {
             viewHolder.details.setVisibility(View.VISIBLE);
