diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsite/AddSettingsWebsiteTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsite/AddSettingsWebsiteTest.java
index 395c088..d85bb59 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsite/AddSettingsWebsiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsite/AddSettingsWebsiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
