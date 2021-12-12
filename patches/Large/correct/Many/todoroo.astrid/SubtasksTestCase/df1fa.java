diff --git a/tests/src/com/todoroo/astrid/subtasks/SubtasksTestCase.java b/tests/src/com/todoroo/astrid/subtasks/SubtasksTestCase.java
index 90bacfc..9da17ef 100644
--- a/tests/src/com/todoroo/astrid/subtasks/SubtasksTestCase.java
+++ b/tests/src/com/todoroo/astrid/subtasks/SubtasksTestCase.java
@@ -14,7 +14,7 @@
  */
 public class SubtasksTestCase extends DatabaseTestCase {
 
-    protected SubtasksUpdater updater;
+    protected SubtasksUpdater<String> updater;
     protected Filter filter;
 
     /* Starting State:
@@ -33,7 +33,7 @@
         super.setUp();
         filter = CoreFilterExposer.buildInboxFilter(getContext().getResources());
         Preferences.clear(SubtasksUpdater.ACTIVE_TASKS_ORDER);
-        updater = new SubtasksUpdater();
+        updater = new SubtasksFilterUpdater();
     }
 
     protected void expectParentAndPosition(Task task, Task parent, int positionInParent) {
