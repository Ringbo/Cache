diff --git a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
index 1c3f0f5..2975cab 100644
--- a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
+++ b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
@@ -127,7 +127,7 @@
 		t.putTransitory(SyncFlags.ACTFM_SUPPRESS_OUTSTANDING_ENTRIES, true);
 		taskDao.save(t);
 		
-		new ReplayOutstandingEntries<Task, TaskOutstanding>(Task.class, NameMaps.TABLE_ID_TASKS, taskDao, taskOutstandingDao).execute();
+		new ReplayOutstandingEntries<Task, TaskOutstanding>(Task.class, NameMaps.TABLE_ID_TASKS, taskDao, taskOutstandingDao, false).execute();
 		
 		t = taskDao.fetch(t.getId(), Task.TITLE, Task.IMPORTANCE);
 		assertEquals(SYNC_TASK_TITLE, t.getValue(Task.TITLE));
