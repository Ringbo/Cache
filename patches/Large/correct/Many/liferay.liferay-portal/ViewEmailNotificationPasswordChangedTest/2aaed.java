diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationpasswordchanged/ViewEmailNotificationPasswordChangedTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationpasswordchanged/ViewEmailNotificationPasswordChangedTest.java
index 56c6251..59c4709 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationpasswordchanged/ViewEmailNotificationPasswordChangedTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationpasswordchanged/ViewEmailNotificationPasswordChangedTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
