diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
index f6d7e26..a51bca0 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
@@ -386,8 +386,8 @@
 		lockLocalService.unlock(DLFolder.class.getName(), folderId);
 
 		try {
-			List<DLFileEntry> fileEntries = dlFileEntryService.getFileEntries(
-				groupId, folderId);
+			List<DLFileEntry> fileEntries =
+				dlFileEntryLocalService.getFileEntries(groupId, folderId);
 
 			for (DLFileEntry fileEntry : fileEntries) {
 				dlFileEntryService.unlockFileEntry(
