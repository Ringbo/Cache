diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseInstallMorePluginsTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseInstallMorePluginsTest.java
index 941c8e3..7e719c6 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseInstallMorePluginsTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseInstallMorePluginsTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
