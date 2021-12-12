diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/deletecalendareventsite/DeleteCalendarEventSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/deletecalendareventsite/DeleteCalendarEventSiteTest.java
index a4b0e2f..1268b22 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/deletecalendareventsite/DeleteCalendarEventSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/deletecalendareventsite/DeleteCalendarEventSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -52,7 +52,7 @@
 		assertEquals(RuntimeVariables.replace("Anniversary"),
 			selenium.getText(
 				"//td[@id='_8_ocerSearchContainer_col-type_row-1']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.waitForVisible(
 			"//td[contains(.,'Actions')]/span/ul/li/strong/a");
 		selenium.clickAt("//td[contains(.,'Actions')]/span/ul/li/strong/a",
