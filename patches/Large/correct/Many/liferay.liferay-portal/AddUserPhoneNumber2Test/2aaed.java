diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber2Test.java
index 1b29ed9..39a63c5 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
