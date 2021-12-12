diff --git a/portal-web/test/functional/com/liferay/portalweb/properties/messageboards/anonymousposting/viewmbanonymouspostingno/ViewMBAnonymousPostingNoTest.java b/portal-web/test/functional/com/liferay/portalweb/properties/messageboards/anonymousposting/viewmbanonymouspostingno/ViewMBAnonymousPostingNoTest.java
index 0381b46..011b161 100644
--- a/portal-web/test/functional/com/liferay/portalweb/properties/messageboards/anonymousposting/viewmbanonymouspostingno/ViewMBAnonymousPostingNoTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/properties/messageboards/anonymousposting/viewmbanonymouspostingno/ViewMBAnonymousPostingNoTest.java
@@ -31,8 +31,7 @@
 		selenium.clickAt("//input[@value='Post New Thread']",
 			RuntimeVariables.replace("Post New Thread"));
 		selenium.waitForPageToLoad("30000");
-		selenium.waitForElementPresent(
-			"//iframe[contains(@title,'Rich Text Editor')]");
+		selenium.waitForVisible("//iframe[contains(@title,'Rich Text Editor')]");
 		assertFalse(selenium.isTextPresent("Anonymous"));
 		assertFalse(selenium.isTextPresent(
 				"If this is checked, then this message will be posted anonymously."));
