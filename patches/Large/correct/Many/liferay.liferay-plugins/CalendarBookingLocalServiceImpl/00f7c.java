diff --git a/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java b/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
index 59bfd1a..d6f02ac 100644
--- a/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
+++ b/portlets/enterprise-calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/service/impl/CalendarBookingLocalServiceImpl.java
@@ -47,7 +47,7 @@
 
 	public CalendarBooking addCalendarBooking(
 			long userId, long calendarId, long parentCalendarBookingId,
-			long[] childCalendarBookingIds, Map<Locale, String> titleMap,
+			long[] childCalendarIds, Map<Locale, String> titleMap,
 			Map<Locale, String> descriptionMap, String location, Date startDate,
 			Date endDate, boolean allDay, String recurrence, int firstReminder,
 			int secondReminder, ServiceContext serviceContext)
@@ -137,7 +137,7 @@
 		calendarBookingPersistence.update(calendarBooking, false);
 
 		addChildCalendarBookings(
-			calendarBooking, childCalendarBookingIds, serviceContext);
+			calendarBooking, childCalendarIds, serviceContext);
 
 		// Workflow
 
@@ -297,7 +297,7 @@
 
 	public CalendarBooking updateCalendarBooking(
 			long userId, long calendarBookingId, long calendarId,
-			long[] childCalendarBookingIds, Map<Locale, String> titleMap,
+			long[] childCalendarIds, Map<Locale, String> titleMap,
 			Map<Locale, String> descriptionMap, String location, Date startDate,
 			Date endDate, boolean allDay, String recurrence, int firstReminder,
 			int secondReminder, int status, ServiceContext serviceContext)
@@ -346,7 +346,7 @@
 		calendarBookingPersistence.update(calendarBooking, false);
 
 		addChildCalendarBookings(
-			calendarBooking, childCalendarBookingIds, serviceContext);
+			calendarBooking, childCalendarIds, serviceContext);
 
 		// Workflow
 
@@ -393,7 +393,8 @@
 				calendarBooking.getCalendarBookingId());
 
 		for (CalendarBooking childCalendarBooking : childCalendarBookings) {
-			if (ArrayUtil.contains(
+			if (childCalendarBooking.isMasterBooking() ||
+				ArrayUtil.contains(
 					childCalendarIds, childCalendarBooking.getCalendarId())) {
 
 				continue;
