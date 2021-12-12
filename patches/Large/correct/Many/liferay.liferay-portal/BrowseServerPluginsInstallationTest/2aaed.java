diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerPluginsInstallationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerPluginsInstallationTest.java
index eb5d239..7990af0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerPluginsInstallationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerPluginsInstallationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
