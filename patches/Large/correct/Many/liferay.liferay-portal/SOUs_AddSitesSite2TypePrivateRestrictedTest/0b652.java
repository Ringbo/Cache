diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_AddSitesSite2TypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_AddSitesSite2TypePrivateRestrictedTest.java
index afad32b..91c4695 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_AddSitesSite2TypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_AddSitesSite2TypePrivateRestrictedTest.java
@@ -83,7 +83,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Private Restricted Site2 Name')]/a"));
