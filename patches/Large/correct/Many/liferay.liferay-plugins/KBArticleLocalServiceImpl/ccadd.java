diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index d2fb5ac..cdd51ae 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -1121,7 +1121,7 @@
 					KBArticle.class.getName(), kbArticle.getClassPK(),
 					PortletKeys.KNOWLEDGE_BASE_ARTICLE,
 					kbArticle.getAttachmentsFolderId(), inputStream,
-					shortFileName, mimeType);
+					shortFileName, mimeType, true);
 			}
 			finally {
 				StreamUtil.cleanUp(inputStream);
