diff --git a/shared/sync-engine-shared/src/com/liferay/sync/engine/model/SyncAccountModelListener.java b/shared/sync-engine-shared/src/com/liferay/sync/engine/model/SyncAccountModelListener.java
index 1bf5f05..3bcfe55 100644
--- a/shared/sync-engine-shared/src/com/liferay/sync/engine/model/SyncAccountModelListener.java
+++ b/shared/sync-engine-shared/src/com/liferay/sync/engine/model/SyncAccountModelListener.java
@@ -64,10 +64,10 @@
 		Set<Long> activeSyncAccountIds =
 			SyncAccountService.getActiveSyncAccountIds();
 
-		activeSyncAccountIds.remove(syncAccount.getSyncAccountId());
+		activeSyncAccountIds.add(syncAccount.getSyncAccountId());
 
 		try {
-			SyncEngine.cancelSyncAccountTasks(syncAccount.getSyncAccountId());
+			SyncEngine.scheduleSyncAccountTasks(syncAccount.getSyncAccountId());
 		}
 		catch (Exception e) {
 			_logger.error(e.getMessage(), e);
