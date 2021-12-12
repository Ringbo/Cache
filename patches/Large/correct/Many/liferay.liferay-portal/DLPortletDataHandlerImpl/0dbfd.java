diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerImpl.java
index ca4128c..5a45da3 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerImpl.java
@@ -193,12 +193,12 @@
 
 		if (portletDataContext.getBooleanParameter(_NAMESPACE, "categories")) {
 			assetCategoryIds = portletDataContext.getAssetCategoryIds(
-				FileEntry.class, fileEntry.getFileEntryId());
+				DLFileEntry.class, fileEntry.getFileEntryId());
 		}
 
 		if (portletDataContext.getBooleanParameter(_NAMESPACE, "tags")) {
 			assetTagNames = portletDataContext.getAssetTagNames(
-				FileEntry.class, fileEntry.getFileEntryId());
+				DLFileEntry.class, fileEntry.getFileEntryId());
 		}
 
 		ServiceContext serviceContext = portletDataContext.createServiceContext(
@@ -361,7 +361,7 @@
 
 		Map<String, String> fileEntryTitles =
 			(Map<String, String>)portletDataContext.getNewPrimaryKeysMap(
-				FileEntry.class.getName() + ".title");
+				DLFileEntry.class.getName() + ".title");
 
 		fileEntryTitles.put(fileEntry.getTitle(), importedFileEntry.getTitle());
 
@@ -653,7 +653,7 @@
 
 		Map<Long, Long> fileEntryPKs =
 			(Map<Long, Long>)portletDataContext.getNewPrimaryKeysMap(
-				FileEntry.class);
+				DLFileEntry.class);
 
 		long fileEntryId = MapUtil.getLong(
 			fileEntryPKs, fileRank.getFileEntryId(), fileRank.getFileEntryId());
@@ -692,7 +692,7 @@
 
 		Map<Long, Long> fileEntryPKs =
 			(Map<Long, Long>)portletDataContext.getNewPrimaryKeysMap(
-				FileEntry.class);
+				DLFileEntry.class);
 
 		long fileEntryId = MapUtil.getLong(
 			fileEntryPKs, fileShortcut.getToFileEntryId(),
