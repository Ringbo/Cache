diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
index aac1f52..9475bfc 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFolderServiceImpl.java
@@ -91,7 +91,7 @@
 			long groupId, long folderId, int status, int start, int end)
 		throws PortalException, SystemException {
 
-		if (DLFolderPermission.contains(
+		if (!DLFolderPermission.contains(
 				getPermissionChecker(), groupId, folderId, ActionKeys.VIEW)) {
 
 			return Collections.emptyList();
