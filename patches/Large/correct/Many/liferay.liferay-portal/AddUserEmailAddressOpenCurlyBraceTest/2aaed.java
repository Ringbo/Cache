diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopencurlybrace/AddUserEmailAddressOpenCurlyBraceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopencurlybrace/AddUserEmailAddressOpenCurlyBraceTest.java
index 32435214..e84618c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopencurlybrace/AddUserEmailAddressOpenCurlyBraceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopencurlybrace/AddUserEmailAddressOpenCurlyBraceTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
