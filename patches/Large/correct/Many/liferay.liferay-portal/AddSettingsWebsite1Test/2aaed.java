diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite1Test.java
index 8db88d2..0aa2cc1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
