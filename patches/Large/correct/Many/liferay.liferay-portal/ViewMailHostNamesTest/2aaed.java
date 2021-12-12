diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewmailhostnames/ViewMailHostNamesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewmailhostnames/ViewMailHostNamesTest.java
index e4701ee..b15db20 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewmailhostnames/ViewMailHostNamesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewmailhostnames/ViewMailHostNamesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
