diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/deletesettingsadditionalemailaddress/DeleteSettingsAdditionalEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/deletesettingsadditionalemailaddress/DeleteSettingsAdditionalEmailAddressTest.java
index f9a9c56..ede201b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/deletesettingsadditionalemailaddress/DeleteSettingsAdditionalEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/deletesettingsadditionalemailaddress/DeleteSettingsAdditionalEmailAddressTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
