diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddress/AddSettingsAdditionalEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddress/AddSettingsAdditionalEmailAddressTest.java
index d3b07ac..9c92fa0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddress/AddSettingsAdditionalEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddress/AddSettingsAdditionalEmailAddressTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
