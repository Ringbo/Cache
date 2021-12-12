diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/deletesettingswebsite/DeleteSettingsWebsiteTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/deletesettingswebsite/DeleteSettingsWebsiteTest.java
index 3ccdb9d..ac98888 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/deletesettingswebsite/DeleteSettingsWebsiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/deletesettingswebsite/DeleteSettingsWebsiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
