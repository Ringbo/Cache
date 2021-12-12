diff --git a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
index 7b5c04a..a786e89 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
@@ -1499,7 +1499,7 @@
 			wikiPagePersistence.update(page);
 		}
 
-		List<WikiPage> pageVersions = wikiPagePersistence.findByG_N_H(
+		List<WikiPage> pageVersions = wikiPagePersistence.findByR_N_H(
 			page.getResourcePrimKey(), page.getNodeId(), false);
 
 		pageVersions = ListUtil.sort(pageVersions, new PageVersionComparator());
