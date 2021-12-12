diff --git a/modules/apps/journal/journal-web/src/com/liferay/journal/web/portlet/JournalPortlet.java b/modules/apps/journal/journal-web/src/com/liferay/journal/web/portlet/JournalPortlet.java
index 4349590..50be867 100644
--- a/modules/apps/journal/journal-web/src/com/liferay/journal/web/portlet/JournalPortlet.java
+++ b/modules/apps/journal/journal-web/src/com/liferay/journal/web/portlet/JournalPortlet.java
@@ -376,7 +376,7 @@
 			RenderRequest renderRequest, RenderResponse renderResponse)
 		throws IOException, PortletException {
 
-		String path = getPath(renderRequest);
+		String path = getPath(renderRequest, renderResponse);
 
 		if (Validator.equals(path, "/edit_article.jsp")) {
 			renderRequest.setAttribute(
