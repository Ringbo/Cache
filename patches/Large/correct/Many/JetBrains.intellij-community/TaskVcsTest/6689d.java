diff --git a/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java b/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
index a757eec..9952f95 100644
--- a/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
+++ b/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
@@ -411,7 +411,7 @@
     final String changelistName = myTaskManager.getChangelistName(task);
     myChangeListManager.removeChangeList(changelistName);
 
-    myChangeListManager.ensureUpToDate();
+    myChangeListManager.waitUntilRefreshed();
     assertTrue(myTaskManager.isLocallyClosed(task));
     myTaskManager.activateTask(task, false);
     assertNotNull(myChangeListManager.findChangeList(changelistName));
