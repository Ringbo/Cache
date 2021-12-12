diff --git a/portal-web/test/functional/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/selectwcwebcontentwcd/SelectWCWebContentWCDTest.java b/portal-web/test/functional/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/selectwcwebcontentwcd/SelectWCWebContentWCDTest.java
index 96489fe..4d7d1cb 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/selectwcwebcontentwcd/SelectWCWebContentWCDTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portlet/webcontentdisplay/webcontent/selectwcwebcontentwcd/SelectWCWebContentWCDTest.java
@@ -28,7 +28,7 @@
 		selenium.clickAt("link=Web Content Display Test Page",
 			RuntimeVariables.replace("Web Content Display Test Page"));
 		selenium.waitForPageToLoad("30000");
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Options"),
 			selenium.getText("//span[@title='Options']/ul/li/strong/a"));
 		selenium.clickAt("//span[@title='Options']/ul/li/strong/a",
@@ -44,7 +44,8 @@
 			"//iframe[contains(@id,'configurationIframeDialog')]");
 		selenium.selectFrame(
 			"//iframe[contains(@id,'configurationIframeDialog')]");
-		Thread.sleep(5000);
+		selenium.waitForElementPresent(
+			"//script[contains(@src,'/liferay/navigation_interaction.js')]");
 		selenium.waitForVisible("//td[2]/a");
 		assertEquals(RuntimeVariables.replace("WC WebContent Title"),
 			selenium.getText("//td[2]/a"));
