diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/AddSitesSite1TypePublicRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/AddSitesSite1TypePublicRestrictedTest.java
index b3c184e..c605a3a 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/AddSitesSite1TypePublicRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/AddSitesSite1TypePublicRestrictedTest.java
@@ -83,7 +83,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Public Restricted Site1 Name')]/a"));
