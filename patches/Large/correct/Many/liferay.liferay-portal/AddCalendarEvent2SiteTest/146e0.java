diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventsite/AddCalendarEvent2SiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventsite/AddCalendarEvent2SiteTest.java
index 933bdda..aa98b9b 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventsite/AddCalendarEvent2SiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/addcalendareventsite/AddCalendarEvent2SiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -45,7 +45,7 @@
 		selenium.clickAt("//input[@value='Add Event']",
 			RuntimeVariables.replace("Add Event"));
 		selenium.waitForPageToLoad("30000");
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.type("//input[@id='_8_title']",
 			RuntimeVariables.replace("Calendar Event2 Title"));
 		selenium.waitForElementPresent(
