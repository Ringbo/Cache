diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/deletesitetypepublicrestricted/DeleteSiteTypePublicRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/deletesitetypepublicrestricted/DeleteSiteTypePublicRestrictedTest.java
index 5b0b823..adf7729 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/deletesitetypepublicrestricted/DeleteSiteTypePublicRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/deletesitetypepublicrestricted/DeleteSiteTypePublicRestrictedTest.java
@@ -41,7 +41,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
