diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerTest.java
index d55a031..25bf122 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
