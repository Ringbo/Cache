diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/deletesettingsphonenumber/DeleteSettingsPhoneNumberTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/deletesettingsphonenumber/DeleteSettingsPhoneNumberTest.java
index 3b22003..3717e1a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/deletesettingsphonenumber/DeleteSettingsPhoneNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/deletesettingsphonenumber/DeleteSettingsPhoneNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
