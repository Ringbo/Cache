diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresszipnull/AddUserAddressZipNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresszipnull/AddUserAddressZipNullTest.java
index 0f1c078..7a76c90 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresszipnull/AddUserAddressZipNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresszipnull/AddUserAddressZipNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
