diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/portlet/AdminPortlet.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/portlet/AdminPortlet.java
index 64b90c5..3e8a5b2 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/portlet/AdminPortlet.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/portlet/AdminPortlet.java
@@ -400,7 +400,8 @@
 
 	@Override
 	protected boolean isSessionErrorException(Throwable cause) {
-		if (cause instanceof KBTemplateContentException ||
+		if (cause instanceof KBArticleImportException ||
+			cause instanceof KBTemplateContentException ||
 			cause instanceof KBTemplateTitleException ||
 			cause instanceof NoSuchTemplateException ||
 			super.isSessionErrorException(cause)) {
