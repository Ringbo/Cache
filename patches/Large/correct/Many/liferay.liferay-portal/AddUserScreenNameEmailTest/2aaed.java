diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameemail/AddUserScreenNameEmailTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameemail/AddUserScreenNameEmailTest.java
index 6fe35f2..62b7e3e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameemail/AddUserScreenNameEmailTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameemail/AddUserScreenNameEmailTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
