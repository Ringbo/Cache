diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ViewImportCalendarSiteLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ViewImportCalendarSiteLARTest.java
index 392e5e0..34a292d 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ViewImportCalendarSiteLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ViewImportCalendarSiteLARTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -96,7 +96,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -158,7 +158,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -180,7 +180,7 @@
 		assertEquals(RuntimeVariables.replace("Anniversary"),
 			selenium.getText(
 				"//td[@id='_8_ocerSearchContainer_col-type_row-2']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.waitForVisible(
 			"xPath=(//td[contains(.,'Actions')]/span/ul/li/strong/a)[2]");
 		selenium.clickAt("xPath=(//td[contains(.,'Actions')]/span/ul/li/strong/a)[2]",
