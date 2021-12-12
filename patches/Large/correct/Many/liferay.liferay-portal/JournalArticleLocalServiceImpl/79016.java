diff --git a/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
index d822679..cecf87e 100644
--- a/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
@@ -6922,7 +6922,7 @@
 			ddmStructureKey, true);
 
 		List<DDMStructure> ddmStructures =
-			ddmStructureLocalService.getFolderStructures(
+			ddmStructureLocalService.getJournalFolderStructures(
 				PortalUtil.getCurrentAndAncestorSiteGroupIds(groupId), folderId,
 				true);
 
