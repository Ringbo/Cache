diff --git a/modules/apps/portal-settings/portal-settings-api/src/main/java/com/liferay/portal/settings/portlet/action/BasePortalSettingsFormMVCActionCommand.java b/modules/apps/portal-settings/portal-settings-api/src/main/java/com/liferay/portal/settings/portlet/action/BasePortalSettingsFormMVCActionCommand.java
index 20c6aba..352823f 100644
--- a/modules/apps/portal-settings/portal-settings-api/src/main/java/com/liferay/portal/settings/portlet/action/BasePortalSettingsFormMVCActionCommand.java
+++ b/modules/apps/portal-settings/portal-settings-api/src/main/java/com/liferay/portal/settings/portlet/action/BasePortalSettingsFormMVCActionCommand.java
@@ -54,7 +54,7 @@
 			return;
 		}
 
-		storeSettings(actionRequest, themeDisplay, getServiceName());
+		storeSettings(actionRequest, themeDisplay);
 	}
 
 	protected boolean getBoolean(ActionRequest actionRequest, String name) {
