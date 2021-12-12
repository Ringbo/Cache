diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressapostrophe/AddUserEmailAddressApostropheTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressapostrophe/AddUserEmailAddressApostropheTest.java
index d210e9f..580bb15 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressapostrophe/AddUserEmailAddressApostropheTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressapostrophe/AddUserEmailAddressApostropheTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
