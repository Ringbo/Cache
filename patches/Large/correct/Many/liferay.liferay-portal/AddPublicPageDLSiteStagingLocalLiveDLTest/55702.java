diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/publishtolivenowpagedldock/AddPublicPageDLSiteStagingLocalLiveDLTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/publishtolivenowpagedldock/AddPublicPageDLSiteStagingLocalLiveDLTest.java
index 35d6d24..008faea 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/publishtolivenowpagedldock/AddPublicPageDLSiteStagingLocalLiveDLTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/publishtolivenowpagedldock/AddPublicPageDLSiteStagingLocalLiveDLTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
