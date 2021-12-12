diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressstreetnull/AddSettingsAddressStreetNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressstreetnull/AddSettingsAddressStreetNullTest.java
index e97ac53..5838e95 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressstreetnull/AddSettingsAddressStreetNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddressstreetnull/AddSettingsAddressStreetNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
