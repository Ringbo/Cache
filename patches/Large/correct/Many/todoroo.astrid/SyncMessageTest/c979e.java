diff --git a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
index 33221b2..583effd 100644
--- a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
+++ b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
@@ -133,7 +133,7 @@
 		t.putTransitory(SyncFlags.ACTFM_SUPPRESS_OUTSTANDING_ENTRIES, true);
 		taskDao.save(t);
 		
-		new ReplayOutstandingEntries<Task, TaskOutstanding>(Task.class, NameMaps.TABLE_ID_TASKS, taskDao, taskOutstandingDao, null, false).execute();
+		new ReplayOutstandingEntries<Task, TaskOutstanding>(Task.class, NameMaps.TABLE_ID_TASKS, taskDao, taskOutstandingDao, false).execute();
 		
 		t = taskDao.fetch(t.getId(), Task.TITLE, Task.IMPORTANCE);
 		assertEquals(SYNC_TASK_TITLE, t.getValue(Task.TITLE));
