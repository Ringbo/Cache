diff --git a/tests/src/com/todoroo/astrid/gtasks/GtasksSyncOnSaveTest.java b/tests/src/com/todoroo/astrid/gtasks/GtasksSyncOnSaveTest.java
index 3bb3a19..8e8efd0 100644
--- a/tests/src/com/todoroo/astrid/gtasks/GtasksSyncOnSaveTest.java
+++ b/tests/src/com/todoroo/astrid/gtasks/GtasksSyncOnSaveTest.java
@@ -147,7 +147,7 @@
     }
 
     private boolean taskWithTitleExists(String title) throws IOException {
-        Tasks allTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false);
+        Tasks allTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false, false);
         if (allTasks.items != null) {
             for (com.google.api.services.tasks.v1.model.Task t : allTasks.items) {
                 if (t.title.equals(title))
@@ -209,7 +209,7 @@
     }
 
     private void setupTestList() throws Exception {
-        Tasks defaultListTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false);
+        Tasks defaultListTasks = gtasksService.getAllGtasksFromListId(DEFAULT_LIST, false, false);
         if (defaultListTasks.items != null) {
             for (com.google.api.services.tasks.v1.model.Task t : defaultListTasks.items) {
                 gtasksService.deleteGtask(DEFAULT_LIST, t.id);
