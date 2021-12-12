diff --git a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
index 583effd..4d3a127 100644
--- a/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
+++ b/tests-sync/src/com/todoroo/astrid/sync/SyncMessageTest.java
@@ -22,7 +22,7 @@
 		Task t = createTask();
 		try {
 			ChangesHappened<?, ?> changes = ChangesHappened.instantiateChangesHappened(t.getId(), ModelType.TYPE_TASK);
-			assertNotNull(changes.serializeToJSON());
+			assertNotNull(changes.serializeToJSON(null));
 			assertTrue(changes.getChanges().size() > 0);
 			assertFalse(RemoteModel.NO_UUID.equals(changes.getUUID()));
 			assertEquals(t.getValue(Task.UUID), changes.getUUID());
