diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
index d9bb61d..996ff43 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryServiceImpl.java
@@ -210,7 +210,7 @@
 		}
 
 		InputStream inputStream = DLStoreUtil.getFileAsStream(
-			dlFileEntry.getCompanyId(), dlFileEntry.getFolderId(),
+			dlFileEntry.getCompanyId(), dlFileEntry.getDataRepositoryId(),
 			dlFileEntry.getName());
 
 		DLFileEntry newDlFileEntry = addFileEntry(
