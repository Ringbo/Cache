diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/SOUs_ViewDenyMemberSitePublicRestrictedSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/SOUs_ViewDenyMemberSitePublicRestrictedSiteTest.java
index 752a840..f7c6772 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/SOUs_ViewDenyMemberSitePublicRestrictedSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/SOUs_ViewDenyMemberSitePublicRestrictedSiteTest.java
@@ -37,7 +37,7 @@
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -54,14 +54,14 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		selenium.select("//select[@id='_5_WAR_soportlet_tabs1']",
 			RuntimeVariables.replace("All Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
