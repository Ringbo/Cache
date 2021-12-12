diff --git a/astrid/plugin-src/com/todoroo/astrid/notes/EditNoteActivity.java b/astrid/plugin-src/com/todoroo/astrid/notes/EditNoteActivity.java
index 5249e94..ab70706 100644
--- a/astrid/plugin-src/com/todoroo/astrid/notes/EditNoteActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/notes/EditNoteActivity.java
@@ -148,7 +148,7 @@
 
     public void loadViewForTaskID(long t){
         try {
-            task = PluginServices.getTaskService().fetchById(t, Task.NOTES, Task.ID, Task.UUID, Task.TITLE, Task.HISTORY_FETCH_DATE);
+            task = PluginServices.getTaskService().fetchById(t, Task.NOTES, Task.ID, Task.UUID, Task.TITLE, Task.HISTORY_FETCH_DATE, Task.PUSHED_AT);
         } catch (SQLiteException e) {
             StartupService.handleSQLiteError(ContextManager.getContext(), e);
         }
