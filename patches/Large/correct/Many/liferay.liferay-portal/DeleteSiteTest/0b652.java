diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/deletesite/DeleteSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/deletesite/DeleteSiteTest.java
index ba215d2..184fd26 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/deletesite/DeleteSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/deletesite/DeleteSiteTest.java
@@ -41,7 +41,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Open Site Description"),
