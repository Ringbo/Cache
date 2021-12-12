diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
index a0045e3..e50f4a8 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/service/impl/KBArticleLocalServiceImpl.java
@@ -1921,7 +1921,8 @@
 
 	protected void validate(double priority) throws PortalException {
 		if (priority <= 0) {
-			throw new KBArticlePriorityException();
+			throw new KBArticlePriorityException("Invalid article priority: " +
+				priority);
 		}
 	}
 
@@ -1929,11 +1930,11 @@
 		throws PortalException {
 
 		if (Validator.isNull(title)) {
-			throw new KBArticleTitleException();
+			throw new KBArticleTitleException("Missing title");
 		}
 
 		if (Validator.isNull(content)) {
-			throw new KBArticleContentException();
+			throw new KBArticleContentException("No content found after title");
 		}
 
 		validateSourceURL(sourceURL);
