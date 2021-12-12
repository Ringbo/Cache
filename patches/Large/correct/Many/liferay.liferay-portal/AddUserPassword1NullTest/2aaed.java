diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword1null/AddUserPassword1NullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword1null/AddUserPassword1NullTest.java
index 0f39c04..ea4f840 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword1null/AddUserPassword1NullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassword1null/AddUserPassword1NullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
