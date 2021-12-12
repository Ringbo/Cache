diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivedl/ActivateSiteStagingLocalLiveDLTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivedl/ActivateSiteStagingLocalLiveDLTest.java
index 97bc229..4eefbe8 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivedl/ActivateSiteStagingLocalLiveDLTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/adddldocumentsitestaginglocallivedl/ActivateSiteStagingLocalLiveDLTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
