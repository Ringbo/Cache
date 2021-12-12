diff --git a/portal-impl/src/com/liferay/portal/repository/liferayrepository/LiferayRepository.java b/portal-impl/src/com/liferay/portal/repository/liferayrepository/LiferayRepository.java
index d35c655..2724cdf 100644
--- a/portal-impl/src/com/liferay/portal/repository/liferayrepository/LiferayRepository.java
+++ b/portal-impl/src/com/liferay/portal/repository/liferayrepository/LiferayRepository.java
@@ -1097,7 +1097,7 @@
 		int restrictionType = ParamUtil.getInteger(
 			serviceContext, "restrictionType");
 
-		DLFolder dlFolder = dlFolderLocalService.updateFolder(
+		DLFolder dlFolder = dlFolderService.updateFolder(
 			toFolderId(folderId), toFolderId(parentFolderId), name, description,
 			defaultFileEntryTypeId, fileEntryTypeIds, restrictionType,
 			serviceContext);
