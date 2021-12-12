diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/DenyMemberRequestSiteTypePublicRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/DenyMemberRequestSiteTypePublicRestrictTest.java
index acb50a4..91c6c62 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/DenyMemberRequestSiteTypePublicRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/denymemberrequestsitetypepublicrestrict/DenyMemberRequestSiteTypePublicRestrictTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
