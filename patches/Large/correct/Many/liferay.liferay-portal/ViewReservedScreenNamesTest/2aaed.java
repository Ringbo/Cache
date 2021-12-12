diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewreservedscreennames/ViewReservedScreenNamesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewreservedscreennames/ViewReservedScreenNamesTest.java
index 180f73e..66d75ff 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewreservedscreennames/ViewReservedScreenNamesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/viewreservedscreennames/ViewReservedScreenNamesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
