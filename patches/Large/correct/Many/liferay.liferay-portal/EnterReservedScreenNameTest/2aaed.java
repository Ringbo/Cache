diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedscreenname/EnterReservedScreenNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedscreenname/EnterReservedScreenNameTest.java
index 8a77841..3050b43 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedscreenname/EnterReservedScreenNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedscreenname/EnterReservedScreenNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
