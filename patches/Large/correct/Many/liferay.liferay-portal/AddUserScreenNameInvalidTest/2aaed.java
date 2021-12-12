diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameinvalid/AddUserScreenNameInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameinvalid/AddUserScreenNameInvalidTest.java
index dc63af7..2e66bf0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameinvalid/AddUserScreenNameInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameinvalid/AddUserScreenNameInvalidTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
