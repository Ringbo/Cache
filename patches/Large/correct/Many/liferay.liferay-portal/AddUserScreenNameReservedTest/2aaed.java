diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamereserved/AddUserScreenNameReservedTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamereserved/AddUserScreenNameReservedTest.java
index 9a98f3f..360a219 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamereserved/AddUserScreenNameReservedTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamereserved/AddUserScreenNameReservedTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
