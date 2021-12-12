diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/SOUs_ViewDenyMemberSitePrivateRestrictedSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/SOUs_ViewDenyMemberSitePrivateRestrictedSiteTest.java
index 6c371e0..9f698c9 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/SOUs_ViewDenyMemberSitePrivateRestrictedSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/SOUs_ViewDenyMemberSitePrivateRestrictedSiteTest.java
@@ -37,7 +37,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]"));
@@ -56,14 +56,14 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		selenium.select("//select[@id='_5_WAR_soportlet_tabs1']",
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText("//span[@class='name']"));
 		assertTrue(selenium.isElementNotPresent(
