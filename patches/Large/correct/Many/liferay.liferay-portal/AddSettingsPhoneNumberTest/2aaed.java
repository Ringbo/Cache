diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumber/AddSettingsPhoneNumberTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumber/AddSettingsPhoneNumberTest.java
index 548274a..2f40a42 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumber/AddSettingsPhoneNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumber/AddSettingsPhoneNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
