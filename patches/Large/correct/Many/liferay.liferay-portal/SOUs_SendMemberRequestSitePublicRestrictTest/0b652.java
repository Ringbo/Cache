diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/SOUs_SendMemberRequestSitePublicRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/SOUs_SendMemberRequestSitePublicRestrictTest.java
index 9eb1ca9..7d87d7d 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/SOUs_SendMemberRequestSitePublicRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/SOUs_SendMemberRequestSitePublicRestrictTest.java
@@ -42,7 +42,7 @@
 				"//input[@id='_5_WAR_soportlet_dialogKeywords']"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
