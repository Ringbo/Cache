diff --git a/modules/portal/portal-portlet-tracker/src/com/liferay/portal/portlet/tracker/internal/PortletTracker.java b/modules/portal/portal-portlet-tracker/src/com/liferay/portal/portlet/tracker/internal/PortletTracker.java
index 72b885c..df294cd 100644
--- a/modules/portal/portal-portlet-tracker/src/com/liferay/portal/portlet/tracker/internal/PortletTracker.java
+++ b/modules/portal/portal-portlet-tracker/src/com/liferay/portal/portlet/tracker/internal/PortletTracker.java
@@ -703,22 +703,18 @@
 		com.liferay.portal.model.Portlet portletModel) {
 
 		String portletInfoTitle = GetterUtil.getString(
-			serviceReference.getProperty("javax.portlet.info.title"),
-			portletModel.getPortletId());
+			serviceReference.getProperty("javax.portlet.info.title"));
 
 		String portletDisplayName = GetterUtil.getString(
 			serviceReference.getProperty("javax.portlet.display-name"),
 			portletInfoTitle);
 
 		String portletInfoShortTitle = GetterUtil.getString(
-			serviceReference.getProperty("javax.portlet.info.short-title"),
-			portletModel.getPortletId());
+			serviceReference.getProperty("javax.portlet.info.short-title"));
 		String portletInfoKeyWords = GetterUtil.getString(
-			serviceReference.getProperty("javax.portlet.info.keywords"),
-			portletModel.getPortletId());
+			serviceReference.getProperty("javax.portlet.info.keywords"));
 		String portletDescription = GetterUtil.getString(
-			serviceReference.getProperty("javax.portlet.description"),
-			portletModel.getPortletId());
+			serviceReference.getProperty("javax.portlet.description"));
 
 		PortletInfo portletInfo = new PortletInfo(
 			portletDisplayName, portletInfoShortTitle, portletInfoKeyWords,
