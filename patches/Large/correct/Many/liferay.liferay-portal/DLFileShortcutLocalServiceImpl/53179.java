diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileShortcutLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileShortcutLocalServiceImpl.java
index 847543e..03a911c 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileShortcutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileShortcutLocalServiceImpl.java
@@ -404,7 +404,7 @@
 		String[] assetTagNames = assetTagLocalService.getTagNames(
 			FileEntry.class.getName(), fileEntry.getFileEntryId());
 
-		assetTagLocalService.checkTagsWithProperties(
+		assetTagLocalService.checkTags(
 			serviceContext.getUserId(), serviceContext.getScopeGroupId(),
 			assetTagNames);
 
