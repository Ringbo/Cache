diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_ViewMemberSitePrivateRestrictedSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_ViewMemberSitePrivateRestrictedSiteTest.java
index c94e49c..eb1f1e6 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_ViewMemberSitePrivateRestrictedSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_ViewMemberSitePrivateRestrictedSiteTest.java
@@ -36,7 +36,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -76,7 +76,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
