diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresscitynull/AddUserAddressCityNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresscitynull/AddUserAddressCityNullTest.java
index 85941eb3..2dca8de 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresscitynull/AddUserAddressCityNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddresscitynull/AddUserAddressCityNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
