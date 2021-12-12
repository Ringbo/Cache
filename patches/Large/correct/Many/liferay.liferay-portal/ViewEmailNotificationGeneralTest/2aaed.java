diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationgeneral/ViewEmailNotificationGeneralTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationgeneral/ViewEmailNotificationGeneralTest.java
index b972f27..71b0ce7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationgeneral/ViewEmailNotificationGeneralTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationgeneral/ViewEmailNotificationGeneralTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
