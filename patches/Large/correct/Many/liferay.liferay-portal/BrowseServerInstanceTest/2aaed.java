diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerInstanceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerInstanceTest.java
index 562746e..c24c2e1 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerInstanceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/BrowseServerInstanceTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
