diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationaccountcreated/ViewEmailNotificationAccountCreatedTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationaccountcreated/ViewEmailNotificationAccountCreatedTest.java
index bd629d8..7ca703b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationaccountcreated/ViewEmailNotificationAccountCreatedTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewemailnotificationaccountcreated/ViewEmailNotificationAccountCreatedTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
