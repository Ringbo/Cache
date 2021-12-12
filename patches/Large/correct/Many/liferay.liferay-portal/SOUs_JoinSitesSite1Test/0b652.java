diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_JoinSitesSite1Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_JoinSitesSite1Test.java
index 61da67c..619a0b2 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_JoinSitesSite1Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_JoinSitesSite1Test.java
@@ -41,7 +41,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Open Site1 Description"),
