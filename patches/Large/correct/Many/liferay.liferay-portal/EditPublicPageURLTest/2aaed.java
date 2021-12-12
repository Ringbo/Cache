diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPublicPageURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPublicPageURLTest.java
index 7be34f4..329eb5e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPublicPageURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPublicPageURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
