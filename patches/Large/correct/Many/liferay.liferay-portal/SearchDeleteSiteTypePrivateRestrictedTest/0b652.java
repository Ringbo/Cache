diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdeletesitetypeprivaterestricted/SearchDeleteSiteTypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdeletesitetypeprivaterestricted/SearchDeleteSiteTypePrivateRestrictedTest.java
index 5d9b5b8..874192d 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdeletesitetypeprivaterestricted/SearchDeleteSiteTypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdeletesitetypeprivaterestricted/SearchDeleteSiteTypePrivateRestrictedTest.java
@@ -36,7 +36,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Restricted Site Name"));
@@ -53,7 +53,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Restricted Site Name"));
@@ -61,7 +61,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Restricted Site Name"));
