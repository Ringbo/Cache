diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AddSitesSite1TypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AddSitesSite1TypePrivateRestrictedTest.java
index 6fc01b1..a25000b 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AddSitesSite1TypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AddSitesSite1TypePrivateRestrictedTest.java
@@ -83,7 +83,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Private Restricted Site1 Name')]/a"));
