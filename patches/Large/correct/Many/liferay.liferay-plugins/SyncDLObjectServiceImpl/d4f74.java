diff --git a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
index 8dc3999..39f61cf 100644
--- a/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
+++ b/webs/sync-web/docroot/WEB-INF/src/com/liferay/sync/service/impl/SyncDLObjectServiceImpl.java
@@ -1005,7 +1005,9 @@
 			String type = syncDLObject.getType();
 
 			try {
-				if (type.equals(SyncConstants.TYPE_FILE)) {
+				if (type.equals(SyncConstants.TYPE_FILE) ||
+					type.equals(SyncConstants.TYPE_PRIVATE_WORKING_COPY)) {
+
 					dlAppService.getFileEntry(syncDLObject.getTypePK());
 				}
 				else {
