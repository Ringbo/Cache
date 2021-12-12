diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/portlet/BaseKBPortlet.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/portlet/BaseKBPortlet.java
index f9ea0d3..1ab20b6 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/portlet/BaseKBPortlet.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/portlet/BaseKBPortlet.java
@@ -204,7 +204,7 @@
 			resourceRequest.getPreferences();
 
 		boolean enableRss = GetterUtil.getBoolean(
-			portletPreferences.getValue("enableRss", null));
+			portletPreferences.getValue("enableRss", null), true);
 
 		if (!PortalUtil.isRSSFeedsEnabled() || !enableRss) {
 			PortalUtil.sendRSSFeedsDisabledError(
