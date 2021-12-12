diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/DenyMemberRequestSiteTypePrivateRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/DenyMemberRequestSiteTypePrivateRestrictTest.java
index 498b249..6234f21 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/DenyMemberRequestSiteTypePrivateRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/denymemberrequestsitetypeprivaterestrict/DenyMemberRequestSiteTypePrivateRestrictTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
