diff --git a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
index 29971e3..fd5ffc3 100644
--- a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
+++ b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
@@ -940,7 +940,7 @@
 			resourceRequest.getPreferences();
 
 		boolean enableRss = GetterUtil.getBoolean(
-			portletPreferences.getValue("enableRss", null));
+			portletPreferences.getValue("enableRss", null), true);
 
 		if (!PortalUtil.isRSSFeedsEnabled() || !enableRss) {
 			PortalUtil.sendRSSFeedsDisabledError(
