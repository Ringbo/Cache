diff --git a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
index 5066763..4179c1e 100644
--- a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
+++ b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
@@ -573,7 +573,8 @@
 				new String[] {
 					calendarBooking.getLocation(),
 					dateFormatDateTime.format(startDate.getTime()),
-					calendarBooking.getTitle(), fromAddress, fromName,
+					calendarBooking.getTitle(user.getLocale()), fromAddress,
+					fromName,
 					company.getPortalURL(calendarBooking.getGroupId()),
 					HtmlUtil.escape(toAddress),
 					HtmlUtil.escape(toName),
@@ -584,8 +585,7 @@
 				new String[] {
 					"[$BOOKING_LOCATION$]", "[$BOOKING_START_DATE$]",
 					"[$BOOKING_TITLE$]", "[$FROM_ADDRESS$]", "[$FROM_NAME$]",
-					"[$PORTAL_URL$]", "[$PORTLET_NAME$]", "[$TO_ADDRESS$]",
-					"[$TO_NAME$]"
+					"[$PORTAL_URL$]", "[$TO_ADDRESS$]", "[$TO_NAME$]"
 				},
 				new String[] {
 					calendarBooking.getLocation(),
