diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index f983051..0cff5a9 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -910,7 +910,7 @@
 			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 
 		for (KBArticle kbArticleVersion : kbArticleVersions) {
-			kbArticle.setPriority(priority);
+			kbArticleVersion.setPriority(priority);
 
 			kbArticlePersistence.update(kbArticleVersion);
 		}
