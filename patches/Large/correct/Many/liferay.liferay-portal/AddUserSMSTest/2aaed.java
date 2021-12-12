diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersms/AddUserSMSTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersms/AddUserSMSTest.java
index d3a550a..d6ed6d5 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersms/AddUserSMSTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersms/AddUserSMSTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
