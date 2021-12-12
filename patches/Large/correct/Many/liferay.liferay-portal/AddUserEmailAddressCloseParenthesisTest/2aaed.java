diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscloseparenthesis/AddUserEmailAddressCloseParenthesisTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscloseparenthesis/AddUserEmailAddressCloseParenthesisTest.java
index d86204e..5311c2e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscloseparenthesis/AddUserEmailAddressCloseParenthesisTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscloseparenthesis/AddUserEmailAddressCloseParenthesisTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
