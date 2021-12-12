diff --git a/modules/apps/web-experience/portlet-display-template/portlet-display-template/src/main/java/com/liferay/portlet/display/template/internal/exportimport/portlet/preferences/processor/PortletDisplayTemplateServiceTracker.java b/modules/apps/web-experience/portlet-display-template/portlet-display-template/src/main/java/com/liferay/portlet/display/template/internal/exportimport/portlet/preferences/processor/PortletDisplayTemplateServiceTracker.java
index b90f7ba..dfb37ee 100644
--- a/modules/apps/web-experience/portlet-display-template/portlet-display-template/src/main/java/com/liferay/portlet/display/template/internal/exportimport/portlet/preferences/processor/PortletDisplayTemplateServiceTracker.java
+++ b/modules/apps/web-experience/portlet-display-template/portlet-display-template/src/main/java/com/liferay/portlet/display/template/internal/exportimport/portlet/preferences/processor/PortletDisplayTemplateServiceTracker.java
@@ -98,7 +98,7 @@
 				Dictionary<String, Object> dictionary = _getProperties(
 					serviceReference);
 
-				Object type = dictionary.get("type");
+				Object type = dictionary.remove("type");
 
 				if (Objects.equals(
 						PortletDisplayTemplateConstants.DISPLAY_TEMPLATE_IMPORT,
