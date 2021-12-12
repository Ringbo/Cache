diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/deletesitetypeprivaterestricted/DeleteSiteTypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/deletesitetypeprivaterestricted/DeleteSiteTypePrivateRestrictedTest.java
index cfb68c2..d2ff514 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/deletesitetypeprivaterestricted/DeleteSiteTypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/deletesitetypeprivaterestricted/DeleteSiteTypePrivateRestrictedTest.java
@@ -41,7 +41,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
