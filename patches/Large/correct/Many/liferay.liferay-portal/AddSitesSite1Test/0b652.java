diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/AddSitesSite1Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/AddSitesSite1Test.java
index 07accac..168c7a9 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/AddSitesSite1Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/AddSitesSite1Test.java
@@ -82,7 +82,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Open Site1 Name')]/a"));
