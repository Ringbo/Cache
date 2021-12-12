diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdisplaysettings/AddUserDisplaySettingsTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdisplaysettings/AddUserDisplaySettingsTest.java
index 293cad3..8b08ddd 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdisplaysettings/AddUserDisplaySettingsTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserdisplaysettings/AddUserDisplaySettingsTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
