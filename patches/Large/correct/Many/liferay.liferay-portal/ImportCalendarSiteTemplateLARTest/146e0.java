diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ImportCalendarSiteTemplateLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ImportCalendarSiteTemplateLARTest.java
index e08012c..13f85f9 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ImportCalendarSiteTemplateLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarlar/importcalendarsitelar/ImportCalendarSiteTemplateLARTest.java
@@ -42,7 +42,7 @@
 		assertEquals(RuntimeVariables.replace("Default Social Office Site"),
 			selenium.getText(
 				"//tr[contains(.,'Default Social Office Site')]/td/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Actions"),
 			selenium.getText(
 				"//tr[contains(.,'Default Social Office Site')]/td[contains(.,'Actions')]/span/ul/li/strong/a"));
