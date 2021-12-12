diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/SOUs_ViewImportCalendarSiteLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/SOUs_ViewImportCalendarSiteLARTest.java
index 3f1cf00..cedefe9 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/SOUs_ViewImportCalendarSiteLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/SOUs_ViewImportCalendarSiteLARTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
