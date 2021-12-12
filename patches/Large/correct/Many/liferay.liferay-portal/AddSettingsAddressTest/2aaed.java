diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/AddSettingsAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/AddSettingsAddressTest.java
index 8d841c2..372d8d1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/AddSettingsAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/AddSettingsAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
