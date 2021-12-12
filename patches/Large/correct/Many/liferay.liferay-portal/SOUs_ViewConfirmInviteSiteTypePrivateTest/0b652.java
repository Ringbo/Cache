diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousconfirminvitesitetypeprivate/SOUs_ViewConfirmInviteSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousconfirminvitesitetypeprivate/SOUs_ViewConfirmInviteSiteTypePrivateTest.java
index 8041414..b5efe64 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousconfirminvitesitetypeprivate/SOUs_ViewConfirmInviteSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousconfirminvitesitetypeprivate/SOUs_ViewConfirmInviteSiteTypePrivateTest.java
@@ -39,7 +39,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -81,7 +81,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Private Site Description"),
