diff --git a/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java b/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
index f455e49..a1044b3 100644
--- a/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
+++ b/plugins/tasks/tasks-tests/test/com/intellij/tasks/vcs/TaskVcsTest.java
@@ -101,7 +101,7 @@
 
     assertEquals(localTask, myTaskManager.getAssociatedTask(activeChangeList));
     assertNotNull(activeChangeList);
-    assertEquals(activeChangeList.getName(), "TEST-001 Summary");
+    assertEquals("TEST-001 Summary", activeChangeList.getName());
 
     assertEquals(defaultTask, myTaskManager.getAssociatedTask(anotherChangeList));
     assertEquals(anotherChangeList.getName(), LocalChangeList.DEFAULT_NAME);
@@ -196,7 +196,7 @@
     LocalTask localTask = myTaskManager.activateTask(task, false);
     if (localTask.getChangeLists().isEmpty()) {
       myTaskManager.activateInVcs(localTask, activeTask, TaskManager.VcsOperation.CREATE_CHANGELIST,
-                                  myTaskManager.suggestBranchName(localTask));
+                                  myTaskManager.getChangelistName(localTask));
     }
   }
 
