diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_SendMemberRequestSite1PrivateRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_SendMemberRequestSite1PrivateRestrictTest.java
index 28de9e4..2e1c05e 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_SendMemberRequestSite1PrivateRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_SendMemberRequestSite1PrivateRestrictTest.java
@@ -42,7 +42,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site1 Name"),
 			selenium.getText("//span[@class='name']"));
 		assertEquals(RuntimeVariables.replace(
