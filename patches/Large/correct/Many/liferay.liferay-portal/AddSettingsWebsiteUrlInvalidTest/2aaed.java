diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsiteurlinvalid/AddSettingsWebsiteUrlInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsiteurlinvalid/AddSettingsWebsiteUrlInvalidTest.java
index cf9f6c4..69d4613 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsiteurlinvalid/AddSettingsWebsiteUrlInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsiteurlinvalid/AddSettingsWebsiteUrlInvalidTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
