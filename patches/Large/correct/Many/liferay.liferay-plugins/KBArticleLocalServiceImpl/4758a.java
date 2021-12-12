diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index f1c2675..8e7fc85 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -97,8 +97,7 @@
 		DLStoreUtil.addFile(
 			serviceContext.getCompanyId(), CompanyConstants.SYSTEM_STRING,
 			GroupConstants.DEFAULT_PARENT_GROUP_ID, CompanyConstants.SYSTEM,
-			dirName + StringPool.SLASH + shortFileName, 0, StringPool.BLANK,
-			serviceContext.getModifiedDate(null), serviceContext, bytes);
+			dirName + StringPool.SLASH + shortFileName, serviceContext, bytes);
 	}
 
 	public KBArticle addKBArticle(
