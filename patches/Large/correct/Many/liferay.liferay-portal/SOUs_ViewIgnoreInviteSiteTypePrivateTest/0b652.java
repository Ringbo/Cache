diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousignoreinvitesitetypeprivate/SOUs_ViewIgnoreInviteSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousignoreinvitesitetypeprivate/SOUs_ViewIgnoreInviteSiteTypePrivateTest.java
index 966f7ce..5343778 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousignoreinvitesitetypeprivate/SOUs_ViewIgnoreInviteSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousignoreinvitesitetypeprivate/SOUs_ViewIgnoreInviteSiteTypePrivateTest.java
@@ -39,7 +39,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Site Name"));
@@ -62,7 +62,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("There are no results."),
 			selenium.getText("//li[@class='empty']"));
 		assertFalse(selenium.isTextPresent("Private Site Name"));
