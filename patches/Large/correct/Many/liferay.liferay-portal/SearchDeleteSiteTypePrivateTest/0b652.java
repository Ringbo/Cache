diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdeletesitetypeprivate/SearchDeleteSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdeletesitetypeprivate/SearchDeleteSiteTypePrivateTest.java
index bda52b3..5019bfd 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdeletesitetypeprivate/SearchDeleteSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdeletesitetypeprivate/SearchDeleteSiteTypePrivateTest.java
@@ -35,7 +35,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Site Name"));
@@ -52,7 +52,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Site Name"));
@@ -60,7 +60,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Site Name"));
