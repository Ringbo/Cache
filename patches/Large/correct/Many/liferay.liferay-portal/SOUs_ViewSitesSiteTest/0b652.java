diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousjoinsitessite/SOUs_ViewSitesSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousjoinsitessite/SOUs_ViewSitesSiteTest.java
index 743450a..df82195 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousjoinsitessite/SOUs_ViewSitesSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousjoinsitessite/SOUs_ViewSitesSiteTest.java
@@ -35,7 +35,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -75,7 +75,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Open Site Description"),
