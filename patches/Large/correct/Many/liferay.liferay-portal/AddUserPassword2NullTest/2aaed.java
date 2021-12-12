diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword2null/AddUserPassword2NullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword2null/AddUserPassword2NullTest.java
index 4a961fe..59c915c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword2null/AddUserPassword2NullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword2null/AddUserPassword2NullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
