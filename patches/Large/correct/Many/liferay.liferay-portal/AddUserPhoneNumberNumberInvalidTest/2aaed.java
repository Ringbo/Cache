diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbernumberinvalid/AddUserPhoneNumberNumberInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbernumberinvalid/AddUserPhoneNumberNumberInvalidTest.java
index c8ff8ef..1e42f16 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbernumberinvalid/AddUserPhoneNumberNumberInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbernumberinvalid/AddUserPhoneNumberNumberInvalidTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
