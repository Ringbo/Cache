diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress3Test.java
index d453af9..adddecf 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress3Test.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
