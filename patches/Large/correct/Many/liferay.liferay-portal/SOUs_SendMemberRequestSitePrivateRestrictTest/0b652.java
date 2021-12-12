diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_SendMemberRequestSitePrivateRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_SendMemberRequestSitePrivateRestrictTest.java
index fde092c..8558900 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_SendMemberRequestSitePrivateRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/acceptmemberrequestsiteprivaterestrict/SOUs_SendMemberRequestSitePrivateRestrictTest.java
@@ -42,7 +42,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText("//span[@class='name']"));
 		assertEquals(RuntimeVariables.replace(
