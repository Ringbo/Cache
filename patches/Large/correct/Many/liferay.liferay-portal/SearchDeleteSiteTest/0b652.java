diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdeletesite/SearchDeleteSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdeletesite/SearchDeleteSiteTest.java
index 9e1244c7..0aa1827 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdeletesite/SearchDeleteSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdeletesite/SearchDeleteSiteTest.java
@@ -35,7 +35,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Open Site Name"));
@@ -52,7 +52,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Open Site Name"));
@@ -60,7 +60,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Open Site Name"));
