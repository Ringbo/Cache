diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressstreetnull/AddUserAddressStreetNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressstreetnull/AddUserAddressStreetNullTest.java
index c2e203c..89e21e4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressstreetnull/AddUserAddressStreetNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressstreetnull/AddUserAddressStreetNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
