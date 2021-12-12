diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserannouncement/AddUserAnnouncementTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserannouncement/AddUserAnnouncementTest.java
index 5340eb0..129428d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserannouncement/AddUserAnnouncementTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserannouncement/AddUserAnnouncementTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
