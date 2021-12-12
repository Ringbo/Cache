diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
index a1fed81..e961a07 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
@@ -350,7 +350,7 @@
 		QueryDefinition queryDefinition = new QueryDefinition(
 			WorkflowConstants.STATUS_IN_TRASH, true, start, end, obc);
 
-		return dlFileEntryFinder.findByG_U_F_M(
+		return dlFileEntryFinder.filterFindByG_U_F_M(
 			groupId, 0, folderIds, mimeTypes, queryDefinition);
 	}
 
@@ -392,7 +392,7 @@
 
 		folderIds.add(folderId);
 
-		return dlFileEntryFinder.countByG_U_F_M(
+		return dlFileEntryFinder.filterCountByG_U_F_M(
 			groupId, 0, folderIds, mimeTypes,
 			new QueryDefinition(WorkflowConstants.STATUS_ANY));
 	}
