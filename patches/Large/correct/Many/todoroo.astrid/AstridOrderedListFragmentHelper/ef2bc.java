diff --git a/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java b/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
index 12de667..b4f8846 100644
--- a/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
+++ b/astrid/plugin-src/com/todoroo/astrid/subtasks/AstridOrderedListFragmentHelper.java
@@ -273,8 +273,8 @@
 
         if(chained.size() > 0) {
             // move recurring items to item parent
-            TodorooCursor<Task> recurring = taskService.query(Query.select(Task.ID, Task.UUID, Task.RECURRENCE).where(
-                    Criterion.and(Task.ID.in(chained.toArray(new Long[chained.size()])),
+            TodorooCursor<Task> recurring = taskService.query(Query.select(Task.UUID, Task.RECURRENCE).where(
+                    Criterion.and(Task.UUID.in(chained.toArray(new String[chained.size()])),
                                    Task.RECURRENCE.isNotNull(), Functions.length(Task.RECURRENCE).gt(0))));
             try {
                 Task t = new Task();
