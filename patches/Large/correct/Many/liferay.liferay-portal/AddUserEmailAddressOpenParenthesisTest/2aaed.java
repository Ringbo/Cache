diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopenparenthesis/AddUserEmailAddressOpenParenthesisTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopenparenthesis/AddUserEmailAddressOpenParenthesisTest.java
index 2e4459a..2648f9d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopenparenthesis/AddUserEmailAddressOpenParenthesisTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressopenparenthesis/AddUserEmailAddressOpenParenthesisTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
