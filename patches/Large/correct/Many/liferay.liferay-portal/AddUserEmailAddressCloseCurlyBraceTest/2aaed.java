diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressclosecurlybrace/AddUserEmailAddressCloseCurlyBraceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressclosecurlybrace/AddUserEmailAddressCloseCurlyBraceTest.java
index fcfb211..c3e4450 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressclosecurlybrace/AddUserEmailAddressCloseCurlyBraceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressclosecurlybrace/AddUserEmailAddressCloseCurlyBraceTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
