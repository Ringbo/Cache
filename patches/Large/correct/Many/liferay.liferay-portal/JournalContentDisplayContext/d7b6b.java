diff --git a/modules/apps/journal/journal-content-web/src/com/liferay/journal/content/web/context/JournalContentDisplayContext.java b/modules/apps/journal/journal-content-web/src/com/liferay/journal/content/web/context/JournalContentDisplayContext.java
index 4047c6a..e61d8ba 100644
--- a/modules/apps/journal/journal-content-web/src/com/liferay/journal/content/web/context/JournalContentDisplayContext.java
+++ b/modules/apps/journal/journal-content-web/src/com/liferay/journal/content/web/context/JournalContentDisplayContext.java
@@ -92,7 +92,8 @@
 		JournalArticleDisplay articleDisplay = getArticleDisplay();
 
 		if ((article == null) || !hasViewPermission() ||
-			(articleDisplay == null) || isExpired() || article.isScheduled()) {
+			(articleDisplay == null) || isExpired() || article.isScheduled()
+			|| article.isPending()) {
 
 			portletRequest.setAttribute(
 				WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, Boolean.TRUE);
