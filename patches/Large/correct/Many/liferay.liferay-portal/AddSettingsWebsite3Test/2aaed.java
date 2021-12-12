diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite3Test.java
index 50a5cc5..f181b42 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
