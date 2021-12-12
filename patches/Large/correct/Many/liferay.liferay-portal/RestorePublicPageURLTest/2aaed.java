diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePublicPageURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePublicPageURLTest.java
index c416732..64c63fe 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePublicPageURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestorePublicPageURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
