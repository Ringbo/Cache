diff --git a/shared/sync-engine-shared/src/com/liferay/sync/engine/service/persistence/SyncGroupPersistence.java b/shared/sync-engine-shared/src/com/liferay/sync/engine/service/persistence/SyncGroupPersistence.java
index 0c12c31..7be78ff 100644
--- a/shared/sync-engine-shared/src/com/liferay/sync/engine/service/persistence/SyncGroupPersistence.java
+++ b/shared/sync-engine-shared/src/com/liferay/sync/engine/service/persistence/SyncGroupPersistence.java
@@ -34,7 +34,7 @@
 	public SyncGroup getSyncGroup(long syncAccountId, long groupId)
 		throws SQLException {
 
-		Map<String, Object> fieldValues = new HashMap<String, Object>(1);
+		Map<String, Object> fieldValues = new HashMap<String, Object>();
 
 		fieldValues.put("syncAccountId", syncAccountId);
 		fieldValues.put("groupId", groupId);
