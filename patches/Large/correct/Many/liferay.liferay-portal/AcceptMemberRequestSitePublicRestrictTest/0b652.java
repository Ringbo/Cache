diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/AcceptMemberRequestSitePublicRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/AcceptMemberRequestSitePublicRestrictTest.java
index 2c7f49e..7cc1202 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/AcceptMemberRequestSitePublicRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/acceptmemberrequestsitepublicrestrict/AcceptMemberRequestSitePublicRestrictTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
