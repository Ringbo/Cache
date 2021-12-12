diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandler.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandler.java
index e77b491..b94d741 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandler.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandler.java
@@ -463,7 +463,7 @@
 				KBArticle.class.getName(), kbArticle.getClassPK(),
 				PortletKeys.KNOWLEDGE_BASE_ADMIN,
 				kbArticle.getAttachmentsFolderId(), inputStream, fileName,
-				mimeType);
+				mimeType, true);
 		}
 
 		dirNames.put(resourcePrimKey, dirName);
