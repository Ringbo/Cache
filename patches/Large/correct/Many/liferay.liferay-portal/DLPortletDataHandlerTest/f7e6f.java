diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerTest.java
index 411a879..179a5df 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/lar/DLPortletDataHandlerTest.java
@@ -121,7 +121,7 @@
 
 		DLAppServiceUtil.moveFolderToTrash(parentFolder.getFolderId());
 
-		DLFolderLocalServiceUtil.deleteFolder(parentFolder.getFolderId());
+		DLAppServiceUtil.deleteFolder(parentFolder.getFolderId());
 
 		GroupLocalServiceUtil.deleteGroup(group);
 
