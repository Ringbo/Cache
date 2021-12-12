diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber1Test.java
index aeb8bbb..a8534a9 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/phonenumber/addsettingsphonenumbermultiple/AddSettingsPhoneNumber1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
