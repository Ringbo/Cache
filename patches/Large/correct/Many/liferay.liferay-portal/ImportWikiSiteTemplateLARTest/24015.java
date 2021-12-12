diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ImportWikiSiteTemplateLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ImportWikiSiteTemplateLARTest.java
index 8b587d5..dec27a5 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ImportWikiSiteTemplateLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ImportWikiSiteTemplateLARTest.java
@@ -42,7 +42,7 @@
 		assertEquals(RuntimeVariables.replace("Default Social Office Site"),
 			selenium.getText(
 				"//tr[contains(.,'Default Social Office Site')]/td/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Actions"),
 			selenium.getText(
 				"//tr[contains(.,'Default Social Office Site')]/td[contains(.,'Actions')]/span/ul/li/strong/a"));
