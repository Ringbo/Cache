diff --git a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
index 4d3a127..f7d14dc 100644
--- a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
+++ b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
@@ -59,7 +59,7 @@
 			makeChanges.put("uuid", t.getValue(Task.UUID));
 			
 			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
-			message.processMessage();
+			message.processMessage(null);
 			
 			t = taskDao.fetch(t.getId(), Task.TITLE, Task.IMPORTANCE);
 			assertEquals(MAKE_CHANGES_TITLE, t.getValue(Task.TITLE));
@@ -75,7 +75,7 @@
 			JSONObject makeChanges = getMakeChanges();
 			makeChanges.put("uuid", "1");
 			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
-			message.processMessage();
+			message.processMessage(null);
 			
 			TodorooCursor<Task> cursor = taskDao.query(Query.select(Task.ID, Task.UUID, Task.TITLE, Task.IMPORTANCE).where(Task.UUID.eq("1")));
 			try {
@@ -104,7 +104,7 @@
 			JSONObject makeChanges = getMakeChanges("uuid", newUuid);
 			makeChanges.put("uuid", oldUuid);
 			ServerToClientMessage message = ServerToClientMessage.instantiateMessage(makeChanges);
-			message.processMessage();
+			message.processMessage(null);
 			
 			TodorooCursor<Task> cursor = taskDao.query(Query.select(Task.UUID).where(Task.UUID.eq(newUuid)));
 			try {
