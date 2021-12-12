diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber3Test.java
index 07395cc..f379fa7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
