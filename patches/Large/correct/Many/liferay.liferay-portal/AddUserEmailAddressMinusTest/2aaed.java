diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressminus/AddUserEmailAddressMinusTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressminus/AddUserEmailAddressMinusTest.java
index 1af3dbd..daff9cf 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressminus/AddUserEmailAddressMinusTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressminus/AddUserEmailAddressMinusTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
