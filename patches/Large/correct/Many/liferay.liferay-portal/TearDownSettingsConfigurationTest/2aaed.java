diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/TearDownSettingsConfigurationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/TearDownSettingsConfigurationTest.java
index 4649c28..8872ef1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/TearDownSettingsConfigurationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/TearDownSettingsConfigurationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}