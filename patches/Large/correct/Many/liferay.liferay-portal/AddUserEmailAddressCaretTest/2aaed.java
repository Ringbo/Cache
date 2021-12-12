diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscaret/AddUserEmailAddressCaretTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscaret/AddUserEmailAddressCaretTest.java
index 3ec4679..e4bb75a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscaret/AddUserEmailAddressCaretTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresscaret/AddUserEmailAddressCaretTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
