diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/editpermissionscalendarevent2guestnoview/EditPermissionsCalendarEvent2GuestNoViewTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/editpermissionscalendarevent2guestnoview/EditPermissionsCalendarEvent2GuestNoViewTest.java
index b058901..dc950b3 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/editpermissionscalendarevent2guestnoview/EditPermissionsCalendarEvent2GuestNoViewTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/calendar/calendarevent/editpermissionscalendarevent2guestnoview/EditPermissionsCalendarEvent2GuestNoViewTest.java
@@ -36,7 +36,7 @@
 				assertTrue(selenium.isVisible("//input[@class='search-input']"));
 				selenium.type("//input[@class='search-input']",
 					RuntimeVariables.replace("Open"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Open Site Name"),
 					selenium.getText(
 						"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -60,7 +60,7 @@
 				assertEquals(RuntimeVariables.replace("Anniversary"),
 					selenium.getText(
 						"//td[@id='_8_ocerSearchContainer_col-type_row-2']"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.waitForVisible(
 					"xPath=(//td[contains(.,'Actions')]/span/ul/li/strong/a)[2]");
 				selenium.clickAt("xPath=(//td[contains(.,'Actions')]/span/ul/li/strong/a)[2]",
