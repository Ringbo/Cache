diff --git a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLFileVersionDiffLocalServiceImpl.java b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLFileVersionDiffLocalServiceImpl.java
index 3ae2aca..38d7c80 100644
--- a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLFileVersionDiffLocalServiceImpl.java
+++ b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLFileVersionDiffLocalServiceImpl.java
@@ -109,7 +109,7 @@
 			long destinationFileVersionId)
 		throws SystemException {
 
-		return syncDLFileVersionDiffPersistence.fetchByS_S_D(
+		return syncDLFileVersionDiffPersistence.fetchByF_S_D(
 			fileEntryId, sourceFileVersionId, destinationFileVersionId);
 	}
 
