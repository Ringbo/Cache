diff --git a/portal-impl/src/com/liferay/portlet/journal/trash/JournalArticleTrashHandler.java b/portal-impl/src/com/liferay/portlet/journal/trash/JournalArticleTrashHandler.java
index b3073ab..8f2a42e 100644
--- a/portal-impl/src/com/liferay/portlet/journal/trash/JournalArticleTrashHandler.java
+++ b/portal-impl/src/com/liferay/portlet/journal/trash/JournalArticleTrashHandler.java
@@ -329,7 +329,7 @@
 			article.getStructureId(), true);
 
 		List<DDMStructure> ddmStructures =
-			DDMStructureLocalServiceUtil.getFolderStructures(
+			DDMStructureLocalServiceUtil.getJournalFolderStructures(
 				PortalUtil.getCurrentAndAncestorSiteGroupIds(groupId),
 				containerModelId, true);
 
