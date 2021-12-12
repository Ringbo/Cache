diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index 4907382..1ab58a0 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -1010,9 +1010,9 @@
 
 		TagsAssetLocalServiceUtil.updateAsset(
 			userId, article.getGroupId(), className,
-			article.getResourcePrimKey(), categoriesEntries, tagsEntries, null,
-			null, null, null, ContentTypes.TEXT_HTML, article.getTitle(), null,
-			null, null, 0, 0, null, false);
+			article.getResourcePrimKey(), categoriesEntries, tagsEntries, true,
+			null, null, null, null, ContentTypes.TEXT_HTML, article.getTitle(),
+			null, null, null, 0, 0, null, false);
 	}
 
 	public void validateTitle(String title) throws PortalException {
