diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSiteTest.java
index 388cd69..1d6c440 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/AddSiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
