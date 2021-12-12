diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserinstantmessenger/AddUserInstantMessengerTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserinstantmessenger/AddUserInstantMessengerTest.java
index 46499b2..5201427 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserinstantmessenger/AddUserInstantMessengerTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserinstantmessenger/AddUserInstantMessengerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
