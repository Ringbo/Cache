diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/ratecalendareventsite/RateCalendarEventSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/ratecalendareventsite/RateCalendarEventSiteTest.java
index 0882503..80e0031 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/ratecalendareventsite/RateCalendarEventSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/ratecalendareventsite/RateCalendarEventSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -56,7 +56,7 @@
 			RuntimeVariables.replace("Calendar Event Title"));
 		selenium.waitForPageToLoad("30000");
 		assertTrue(selenium.isVisible("//div[@class='entry-ratings']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertTrue(selenium.isElementPresent(
 				"//div[@class='entry-ratings']/div/div/div/a[5]"));
 		selenium.clickAt("//div[@class='entry-ratings']/div/div/div/a[5]",
