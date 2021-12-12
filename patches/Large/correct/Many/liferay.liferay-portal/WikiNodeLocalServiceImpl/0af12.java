diff --git a/modules/apps/wiki/wiki-service/src/com/liferay/wiki/service/impl/WikiNodeLocalServiceImpl.java b/modules/apps/wiki/wiki-service/src/com/liferay/wiki/service/impl/WikiNodeLocalServiceImpl.java
index 3470ca7..ebef986 100644
--- a/modules/apps/wiki/wiki-service/src/com/liferay/wiki/service/impl/WikiNodeLocalServiceImpl.java
+++ b/modules/apps/wiki/wiki-service/src/com/liferay/wiki/service/impl/WikiNodeLocalServiceImpl.java
@@ -519,7 +519,7 @@
 	protected void moveDependentsToTrash(long nodeId, long trashEntryId)
 		throws PortalException {
 
-		List<WikiPage> pages = wikiPagePersistence.findByN_H(nodeId);
+		List<WikiPage> pages = wikiPagePersistence.findByN_H(nodeId, true);
 
 		for (WikiPage page : pages) {
 			wikiPageLocalService.moveDependentToTrash(page, trashEntryId);
