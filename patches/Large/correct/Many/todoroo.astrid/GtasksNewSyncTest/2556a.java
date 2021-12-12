diff --git a/tests/src/com/todoroo/astrid/gtasks/GtasksNewSyncTest.java b/tests/src/com/todoroo/astrid/gtasks/GtasksNewSyncTest.java
index 8a2de9a..562e97e 100644
--- a/tests/src/com/todoroo/astrid/gtasks/GtasksNewSyncTest.java
+++ b/tests/src/com/todoroo/astrid/gtasks/GtasksNewSyncTest.java
@@ -523,7 +523,7 @@
     }
 
     private void setupTestList() throws Exception {
-        Tasks defaultListTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false);
+        Tasks defaultListTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false, false);
         if (defaultListTasks.items != null) {
             for (com.google.api.services.tasks.v1.model.Task t : defaultListTasks.items) {
                 gtasksService.deleteGtask(DEFAULT_LIST, t.id);
