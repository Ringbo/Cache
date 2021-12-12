diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress2Test.java
index cbd3ee0..0cc1d4c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress2Test.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
