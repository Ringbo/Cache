diff --git a/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/service/impl/AkismetWikiPageLocalServiceImpl.java b/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/service/impl/AkismetWikiPageLocalServiceImpl.java
index b732d90..5de779d 100644
--- a/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/service/impl/AkismetWikiPageLocalServiceImpl.java
+++ b/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/service/impl/AkismetWikiPageLocalServiceImpl.java
@@ -61,7 +61,7 @@
 
 		if (workflowAction == WorkflowConstants.ACTION_SAVE_DRAFT) {
 			return super.addPage(
-				userId, nodeId, redirectTitle, content, summary, minorEdit,
+				userId, nodeId, title, content, summary, minorEdit,
 				serviceContext);
 		}
 
