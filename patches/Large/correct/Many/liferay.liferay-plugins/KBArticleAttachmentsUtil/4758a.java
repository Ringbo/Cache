diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/util/KBArticleAttachmentsUtil.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/util/KBArticleAttachmentsUtil.java
index aecc08d..a77b2d2 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/util/KBArticleAttachmentsUtil.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/util/KBArticleAttachmentsUtil.java
@@ -79,8 +79,7 @@
 					kbArticle.getCompanyId(), CompanyConstants.SYSTEM_STRING,
 					GroupConstants.DEFAULT_PARENT_GROUP_ID,
 					CompanyConstants.SYSTEM,
-					newDirName + StringPool.SLASH + shortFileName, 0,
-					StringPool.BLANK, serviceContext.getModifiedDate(null),
+					newDirName + StringPool.SLASH + shortFileName,
 					serviceContext, bytes);
 			}
 
