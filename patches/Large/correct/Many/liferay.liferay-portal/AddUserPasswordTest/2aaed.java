diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordTest.java
index bc7bdd6..a1bb3dc 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpasswordduplicate/AddUserPasswordTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
