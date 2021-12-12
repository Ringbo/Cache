diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
index ae03589..e8a6325 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
@@ -35,7 +35,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
