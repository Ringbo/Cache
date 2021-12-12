diff --git a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
index b28cd15..6884d08 100644
--- a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
+++ b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
@@ -65,7 +65,7 @@
 			JSONObject makeChanges = getMakeChanges();
 			makeChanges.put("uuid", t.getValue(Task.UUID));
 			
-			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
+			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges, DateUtilities.now());
 			message.processMessage();
 			
 			t = taskDao.fetch(t.getId(), Task.TITLE, Task.IMPORTANCE);
@@ -81,7 +81,7 @@
 		try {
 			JSONObject makeChanges = getMakeChanges();
 			makeChanges.put("uuid", "1");
-			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
+			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges, DateUtilities.now());
 			message.processMessage();
 			
 			TodorooCursor<Task> cursor = taskDao.query(Query.select(Task.ID, Task.UUID, Task.TITLE, Task.IMPORTANCE).where(Task.UUID.eq("1")));
@@ -108,7 +108,7 @@
 			long date = DateUtilities.now();
 			JSONObject makeChanges = getMakeChangesForPushedAt(date);
 			
-			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
+			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges, DateUtilities.now());
 			message.processMessage();
 			
 			assertEquals(date, Preferences.getLong(NameMaps.PUSHED_AT_TASKS, 0));
