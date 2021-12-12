diff --git a/portal-impl/src/com/liferay/portlet/journal/lar/JournalPortletDataHandler.java b/portal-impl/src/com/liferay/portlet/journal/lar/JournalPortletDataHandler.java
index 39f77ec..30db4d3 100644
--- a/portal-impl/src/com/liferay/portlet/journal/lar/JournalPortletDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/journal/lar/JournalPortletDataHandler.java
@@ -87,7 +87,8 @@
 	public JournalPortletDataHandler() {
 		setDeletionSystemEventClassNames(
 			DDMStructure.class.getName(), DDMTemplate.class.getName(),
-			JournalArticle.class.getName(), JournalFeed.class.getName());
+			JournalArticle.class.getName(), JournalFeed.class.getName(),
+			JournalFolder.class.getName());
 		setDataLocalized(true);
 		setExportControls(
 			new PortletDataHandlerBoolean(
