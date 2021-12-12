diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresszipnull/AddSettingsAddressZipNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresszipnull/AddSettingsAddressZipNullTest.java
index 6613533..1e2c59f 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresszipnull/AddSettingsAddressZipNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresszipnull/AddSettingsAddressZipNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
