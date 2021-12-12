diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/SOUs_ViewImportWikiSiteLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/SOUs_ViewImportWikiSiteLARTest.java
index cf4af06..cf889ed 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/SOUs_ViewImportWikiSiteLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/SOUs_ViewImportWikiSiteLARTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
