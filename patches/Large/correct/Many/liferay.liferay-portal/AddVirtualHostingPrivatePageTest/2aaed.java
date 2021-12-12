diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPrivatePageTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPrivatePageTest.java
index 119b10b..eceb301 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPrivatePageTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/AddVirtualHostingPrivatePageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
