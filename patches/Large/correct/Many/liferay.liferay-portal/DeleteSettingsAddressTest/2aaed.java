diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/deletesettingsaddress/DeleteSettingsAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/deletesettingsaddress/DeleteSettingsAddressTest.java
index c1084ac..1d4741c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/deletesettingsaddress/DeleteSettingsAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/deletesettingsaddress/DeleteSettingsAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
