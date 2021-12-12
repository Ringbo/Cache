diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/AddSitesSite1TypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/AddSitesSite1TypePrivateTest.java
index 57f215d..5813e6a 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/AddSitesSite1TypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/AddSitesSite1TypePrivateTest.java
@@ -82,7 +82,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Private Site1 Name')]/a"));
