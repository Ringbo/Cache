diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_SendMemberRequestSite1PublicRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_SendMemberRequestSite1PublicRestrictTest.java
index 5c49c2c..ddd9dea 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_SendMemberRequestSite1PublicRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_SendMemberRequestSite1PublicRestrictTest.java
@@ -42,7 +42,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
