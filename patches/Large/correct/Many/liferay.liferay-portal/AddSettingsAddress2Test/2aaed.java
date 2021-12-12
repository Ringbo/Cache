diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress2Test.java
index b11092d..c8dd6ff 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
