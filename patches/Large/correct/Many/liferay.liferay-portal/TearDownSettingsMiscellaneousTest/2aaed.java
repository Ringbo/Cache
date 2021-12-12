diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/TearDownSettingsMiscellaneousTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/TearDownSettingsMiscellaneousTest.java
index e5de0ca..d7ee355 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/TearDownSettingsMiscellaneousTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/TearDownSettingsMiscellaneousTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
