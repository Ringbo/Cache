diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_AddSitesSite2Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_AddSitesSite2Test.java
index 59519453..ea0bf6d 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_AddSitesSite2Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_AddSitesSite2Test.java
@@ -82,7 +82,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[contains(.,'Open Site2 Name')]/a"));
