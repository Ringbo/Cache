diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressplus/AddUserEmailAddressPlusTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressplus/AddUserEmailAddressPlusTest.java
index 59da59f..9e4b1b4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressplus/AddUserEmailAddressPlusTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressplus/AddUserEmailAddressPlusTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
