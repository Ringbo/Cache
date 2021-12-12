diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventtagssite/AddCalendarEventTagsSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventtagssite/AddCalendarEventTagsSiteTest.java
index 676048a..9dd58f5 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventtagssite/AddCalendarEventTagsSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventtagssite/AddCalendarEventTagsSiteTest.java
@@ -35,7 +35,7 @@
 				assertTrue(selenium.isVisible("//input[@class='search-input']"));
 				selenium.type("//input[@class='search-input']",
 					RuntimeVariables.replace("Open"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Open Site Name"),
 					selenium.getText(
 						"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -51,7 +51,7 @@
 				selenium.clickAt("//input[@value='Add Event']",
 					RuntimeVariables.replace("Add Event"));
 				selenium.waitForPageToLoad("30000");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.type("//input[@id='_8_title']",
 					RuntimeVariables.replace("Calendar Event Title"));
 				selenium.waitForElementPresent(
