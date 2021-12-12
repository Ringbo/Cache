diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite2Test.java
index 91f6777..e985502 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/website/addsettingswebsitemultiple/AddSettingsWebsite2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
