diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassworddifferent/AddUserPasswordDifferentTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassworddifferent/AddUserPasswordDifferentTest.java
index 0f11ac2..e20c699 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassworddifferent/AddUserPasswordDifferentTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserpassworddifferent/AddUserPasswordDifferentTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
