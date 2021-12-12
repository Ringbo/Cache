diff --git a/modules/apps/web-experience/portlet-configuration/portlet-configuration-web/src/main/java/com/liferay/portlet/configuration/web/internal/display/context/PortletConfigurationPermissionsDisplayContext.java b/modules/apps/web-experience/portlet-configuration/portlet-configuration-web/src/main/java/com/liferay/portlet/configuration/web/internal/display/context/PortletConfigurationPermissionsDisplayContext.java
index db6b912..20248a9 100644
--- a/modules/apps/web-experience/portlet-configuration/portlet-configuration-web/src/main/java/com/liferay/portlet/configuration/web/internal/display/context/PortletConfigurationPermissionsDisplayContext.java
+++ b/modules/apps/web-experience/portlet-configuration/portlet-configuration-web/src/main/java/com/liferay/portlet/configuration/web/internal/display/context/PortletConfigurationPermissionsDisplayContext.java
@@ -478,7 +478,9 @@
 			_roleTypes =
 				RoleConstants.TYPES_ORGANIZATION_AND_REGULAR_AND_SITE;
 		}
-		else if (parentOrActualGroup.isUser()) {
+		else if (parentOrActualGroup.isCompany() ||
+				parentOrActualGroup.isUser() ||
+				parentOrActualGroup.isUserGroup()) {
 			_roleTypes = RoleConstants.TYPES_REGULAR;
 		}
 
