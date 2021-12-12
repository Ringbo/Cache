diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/EditTimeZoneTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/EditTimeZoneTest.java
index a314b67..12561b2 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/EditTimeZoneTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/edittimezone/EditTimeZoneTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
