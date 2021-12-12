diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress1Test.java
index f047e87..9949bde 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/additionalemailaddress/addsettingsadditionalemailaddressmultiple/AddSettingsAdditionalEmailAddress1Test.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
