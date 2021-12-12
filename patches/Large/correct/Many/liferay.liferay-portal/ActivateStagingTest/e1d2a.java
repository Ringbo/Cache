diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/ActivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/ActivateStagingTest.java
index 9802a08..ef16d3b 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/ActivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/wcwebcontent/assertcannoteditwcwebcontentwcd/ActivateStagingTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
