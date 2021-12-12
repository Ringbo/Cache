diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index 4364510..cf51267 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/kb/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -292,7 +292,7 @@
 				DLServiceUtil.addFile(
 					companyId, portletId, article.getGroupId(),
 					repositoryId, dirName + "/" + fileName,
-					StringPool.BLANK, new String[0], bytes);
+					0, StringPool.BLANK, new String[0], bytes);
 			}
 			catch (DuplicateFileException dfe) {
 			}
