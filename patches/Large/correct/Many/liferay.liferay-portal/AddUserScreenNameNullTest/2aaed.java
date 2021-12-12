diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenull/AddUserScreenNameNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenull/AddUserScreenNameNullTest.java
index c462c3c..2e2b705 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenull/AddUserScreenNameNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamenull/AddUserScreenNameNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
