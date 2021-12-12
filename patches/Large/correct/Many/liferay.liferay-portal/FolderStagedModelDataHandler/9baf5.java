diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/FolderStagedModelDataHandler.java b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/FolderStagedModelDataHandler.java
index 72b8a03..cf9b967 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/FolderStagedModelDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/FolderStagedModelDataHandler.java
@@ -187,7 +187,8 @@
 		Element folderElement = portletDataContext.getImportDataElement(folder);
 
 		importFolderFileEntryTypes(
-			portletDataContext, folderElement, folder, serviceContext);
+			portletDataContext, folderElement, folder, importedFolder,
+			serviceContext);
 
 		portletDataContext.importClassedModel(
 			folder, importedFolder, DLFolder.class);
@@ -301,7 +302,7 @@
 
 	protected void importFolderFileEntryTypes(
 			PortletDataContext portletDataContext, Element folderElement,
-			Folder folder, ServiceContext serviceContext)
+			Folder folder, Folder importedFolder, ServiceContext serviceContext)
 		throws Exception {
 
 		List<Long> currentFolderFileEntryTypeIds = new ArrayList<Long>();
@@ -358,7 +359,7 @@
 		}
 
 		if (!currentFolderFileEntryTypeIds.isEmpty()) {
-			DLFolder dlFolder = (DLFolder)folder.getModel();
+			DLFolder dlFolder = (DLFolder)importedFolder.getModel();
 
 			dlFolder.setDefaultFileEntryTypeId(defaultFileEntryTypeId);
 			dlFolder.setOverrideFileEntryTypes(true);
