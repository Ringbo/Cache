diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/EditGeneralTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/EditGeneralTest.java
index b568221..2e89c4d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/EditGeneralTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/settings/portalsettings/editgeneral/EditGeneralTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
