diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandler.java b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandler.java
index d44cc5d..89140f2 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandler.java
@@ -235,7 +235,8 @@
 		if (rootFolderId != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID) {
 			Folder folder = DLAppLocalServiceUtil.getFolder(rootFolderId);
 
-			Portlet portlet = PortletLocalServiceUtil.getPortletById(portletId);
+			Portlet portlet = PortletLocalServiceUtil.getPortletById(
+				portletDataContext.getCompanyId(), portletId);
 
 			portletDataContext.addReferenceElement(
 				portlet, rootElement, folder, Folder.class,
