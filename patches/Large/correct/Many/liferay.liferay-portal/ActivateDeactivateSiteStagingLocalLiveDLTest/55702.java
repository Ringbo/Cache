diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/ActivateDeactivateSiteStagingLocalLiveDLTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/ActivateDeactivateSiteStagingLocalLiveDLTest.java
index 9562109..56d4595 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/ActivateDeactivateSiteStagingLocalLiveDLTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/ActivateDeactivateSiteStagingLocalLiveDLTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
