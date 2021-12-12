diff --git a/portal-impl/src/com/liferay/portlet/wiki/lar/WikiPortletDataHandler.java b/portal-impl/src/com/liferay/portlet/wiki/lar/WikiPortletDataHandler.java
index 7710499..334b2df 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/lar/WikiPortletDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/lar/WikiPortletDataHandler.java
@@ -199,7 +199,8 @@
 			PortletPreferences portletPreferences, Element rootElement)
 		throws Exception {
 
-		Portlet portlet = PortletLocalServiceUtil.getPortletById(portletId);
+		Portlet portlet = PortletLocalServiceUtil.getPortletById(
+			portletDataContext.getCompanyId(), portletId);
 
 		String hiddenNodeNames = portletPreferences.getValue(
 			"hiddenNodes", null);
