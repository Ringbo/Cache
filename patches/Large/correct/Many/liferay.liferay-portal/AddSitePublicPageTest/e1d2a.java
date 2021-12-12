diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
index 04ecb9d..5940136 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSitePublicPageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
