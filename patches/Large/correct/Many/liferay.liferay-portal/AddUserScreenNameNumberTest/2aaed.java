diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenumber/AddUserScreenNameNumberTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenumber/AddUserScreenNameNumberTest.java
index 787c39a..f6646a4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenumber/AddUserScreenNameNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenumber/AddUserScreenNameNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
