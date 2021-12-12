diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumber/AddUserPhoneNumberTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumber/AddUserPhoneNumberTest.java
index 66693ee..39ef6ed 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumber/AddUserPhoneNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumber/AddUserPhoneNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
