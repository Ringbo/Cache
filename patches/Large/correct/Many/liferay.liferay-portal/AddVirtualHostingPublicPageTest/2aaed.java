diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPublicPageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPublicPageTest.java
index 4cab8ef..7086e98 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPublicPageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
