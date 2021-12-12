diff --git a/tests/src/com/todoroo/astrid/gtasks/GtasksApiTest.java b/tests/src/com/todoroo/astrid/gtasks/GtasksApiTest.java
index 65c36ff..b833a80 100644
--- a/tests/src/com/todoroo/astrid/gtasks/GtasksApiTest.java
+++ b/tests/src/com/todoroo/astrid/gtasks/GtasksApiTest.java
@@ -141,7 +141,7 @@
     }
 
     private boolean listHasTaskWithTitle(String listId, String title) throws Exception {
-        com.google.api.services.tasks.v1.model.Tasks newListTasks = service.getAllGtasksFromListId(listId, false);
+        com.google.api.services.tasks.v1.model.Tasks newListTasks = service.getAllGtasksFromListId(listId, false, false);
         if (newListTasks.items != null) {
             for (Task t : newListTasks.items) {
                 if (t.title.equals(title)) {
@@ -153,7 +153,7 @@
     }
 
     private boolean taskWithTitleExists(String title) throws Exception {
-        Tasks defaultList = service.getAllGtasksFromListId(DEFAULT_LIST, false);
+        Tasks defaultList = service.getAllGtasksFromListId(DEFAULT_LIST, false, false);
         if (defaultList.items != null) {
             for (Task t : defaultList.items) {
                 if (t.title.equals(title))
@@ -264,7 +264,7 @@
 
     private void clearDefaultList() {
         try {
-            Tasks tasks = service.getAllGtasksFromListId(DEFAULT_LIST, false);
+            Tasks tasks = service.getAllGtasksFromListId(DEFAULT_LIST, false, false);
             if (tasks.items != null) {
                 for (Task t : tasks.items) {
                     service.deleteGtask(DEFAULT_LIST, t.id);
