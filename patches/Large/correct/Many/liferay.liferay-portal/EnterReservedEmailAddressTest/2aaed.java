diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedemailaddress/EnterReservedEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedemailaddress/EnterReservedEmailAddressTest.java
index 361ad38..301794a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedemailaddress/EnterReservedEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/enterreservedemailaddress/EnterReservedEmailAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
