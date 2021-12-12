diff --git a/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/TearDownSettingsAddressTest.java b/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/TearDownSettingsAddressTest.java
index 757aa97..9abb0a7 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/TearDownSettingsAddressTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portal/controlpanel/settings/address/addsettingsaddress/TearDownSettingsAddressTest.java
@@ -65,7 +65,7 @@
 				boolean addressStreet2Present = selenium.isElementPresent(
 						"//input[@id='_130_addressStreet1_1']");
 
-				if (!addressStreet1Present) {
+				if (!addressStreet2Present) {
 					label = 3;
 
 					continue;
