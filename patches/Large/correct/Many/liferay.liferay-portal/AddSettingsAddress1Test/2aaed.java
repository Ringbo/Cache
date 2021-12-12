diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress1Test.java
index 7c90964..754a29f 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
