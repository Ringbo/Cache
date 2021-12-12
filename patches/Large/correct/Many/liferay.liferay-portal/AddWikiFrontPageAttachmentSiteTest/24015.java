diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpageattachmentsite/AddWikiFrontPageAttachmentSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpageattachmentsite/AddWikiFrontPageAttachmentSiteTest.java
index ea9f864..a2cc880 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpageattachmentsite/AddWikiFrontPageAttachmentSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpageattachmentsite/AddWikiFrontPageAttachmentSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -54,7 +54,7 @@
 		selenium.clickAt("//input[@value='Add Attachments']",
 			RuntimeVariables.replace("Add Attachments"));
 		selenium.waitForPageToLoad("30000");
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.waitForVisible("//a[@class='use-fallback using-new-uploader']");
 		assertEquals(RuntimeVariables.replace("Use the classic uploader."),
 			selenium.getText("//a[@class='use-fallback using-new-uploader']"));
@@ -78,7 +78,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
