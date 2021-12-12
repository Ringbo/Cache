diff --git a/portal-service/src/com/liferay/portal/kernel/util/TempFileUtil.java b/portal-service/src/com/liferay/portal/kernel/util/TempFileUtil.java
index ebba5b2..20305a9 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/TempFileUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/TempFileUtil.java
@@ -112,7 +112,7 @@
 		serviceContext.setAddGroupPermissions(true);
 		serviceContext.setAddGuestPermissions(true);
 
-		long repositoryId = PortletFileRepositoryUtil.getPortletRepository(
+		long repositoryId = PortletFileRepositoryUtil.getPortletRepositoryId(
 			groupId, PortletKeys.DOCUMENT_LIBRARY, serviceContext);
 
 		Folder userFolder = PortletFileRepositoryUtil.getPortletFolder(
