diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresscitynull/AddSettingsAddressCityNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresscitynull/AddSettingsAddressCityNullTest.java
index 969fb18..bd841e1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresscitynull/AddSettingsAddressCityNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddresscitynull/AddSettingsAddressCityNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
