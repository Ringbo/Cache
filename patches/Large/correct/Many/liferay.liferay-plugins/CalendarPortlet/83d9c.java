diff --git a/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java b/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
index 161b0e7..53f3f7d 100644
--- a/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
+++ b/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/portlet/CalendarPortlet.java
@@ -262,9 +262,9 @@
 
 		if (calendarBookingId <= 0) {
 			CalendarBookingServiceUtil.addCalendarBooking(
-				calendarId,
+				calendarId, childCalendarIds,
 				CalendarBookingConstants.PARENT_CALENDAR_BOOKING_ID_DEFAULT,
-				childCalendarIds, titleMap, descriptionMap, location,
+				titleMap, descriptionMap, location,
 				startDateJCalendar.getTime(), endDateJCalendar.getTime(),
 				allDay, recurrence, 0, 0, serviceContext);
 		}
