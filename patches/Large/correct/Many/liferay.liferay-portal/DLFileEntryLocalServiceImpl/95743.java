diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
index 1d030d5..d38007e 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
@@ -1288,7 +1288,8 @@
 			// Indexer
 
 			if (dlFileVersion.getVersion().equals(
-					DLFileEntryConstants.VERSION_DEFAULT)) {
+					DLFileEntryConstants.VERSION_DEFAULT) ||
+				(status == WorkflowConstants.STATUS_IN_TRASH)) {
 
 				Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
 					DLFileEntry.class);
@@ -1335,7 +1336,9 @@
 
 		// Indexer
 
-		if (status == WorkflowConstants.STATUS_APPROVED) {
+		if ((status == WorkflowConstants.STATUS_APPROVED) ||
+			(oldStatus == WorkflowConstants.STATUS_IN_TRASH)) {
+
 			reindex(dlFileEntry);
 		}
 
