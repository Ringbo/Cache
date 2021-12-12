diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
index 5e6bb6e..ec19fff 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
@@ -328,7 +328,8 @@
 		DLFileVersion latestDLFileVersion =
 			dlFileVersionLocalService.getLatestFileVersion(fileEntryId, false);
 
-		if (isKeepFileVersionLabel(
+		if (!majorVersion &&
+			isKeepFileVersionLabel(
 				dlFileEntry, lastDLFileVersion, latestDLFileVersion,
 				serviceContext.getWorkflowAction())) {
 
@@ -1376,8 +1377,8 @@
 
 		copyFileEntryMetadata(
 			dlFileVersion.getCompanyId(), dlFileVersion.getFileEntryTypeId(),
-			fileEntryId, newDlFileVersion.getFileVersionId(),
-			dlFileVersion.getFileVersionId(), serviceContext);
+			fileEntryId, dlFileVersion.getFileVersionId(),
+			newDlFileVersion.getFileVersionId(), serviceContext);
 	}
 
 	@Override
