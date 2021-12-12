diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress3Test.java
index cb0b0a0..10f1d1a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressmultiple/AddSettingsAddress3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
