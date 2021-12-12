diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/model/impl/KBArticleImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/model/impl/KBArticleImpl.java
index 65f0fc7..38b105f 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/model/impl/KBArticleImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/model/impl/KBArticleImpl.java
@@ -132,7 +132,7 @@
 			return kbArticle.getTitle();
 		}
 		else {
-			KBFolder kbFolder = KBFolderServiceUtil.getFolder(
+			KBFolder kbFolder = KBFolderServiceUtil.getKBFolder(
 				getParentResourcePrimKey());
 
 			return kbFolder.getName();
