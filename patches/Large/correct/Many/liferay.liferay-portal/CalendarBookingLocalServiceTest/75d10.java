diff --git a/modules/apps/forms-and-workflow/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/service/test/CalendarBookingLocalServiceTest.java b/modules/apps/forms-and-workflow/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/service/test/CalendarBookingLocalServiceTest.java
index facd293..938feba 100644
--- a/modules/apps/forms-and-workflow/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/service/test/CalendarBookingLocalServiceTest.java
+++ b/modules/apps/forms-and-workflow/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/service/test/CalendarBookingLocalServiceTest.java
@@ -581,7 +581,7 @@
 				calendarBooking, 2, titleMap, serviceContext);
 
 		CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance(
-			calendarBooking, 1, true, true);
+			_user.getUserId(), calendarBooking, 1, true, true);
 
 		calendarBookingInstance =
 			CalendarBookingLocalServiceUtil.fetchCalendarBooking(
@@ -659,7 +659,7 @@
 		long calendarBookingId = calendarBooking.getCalendarBookingId();
 
 		CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance(
-			calendarBooking, 0, false);
+			_user.getUserId(), calendarBooking, 0, false);
 
 		calendarBooking = CalendarBookingLocalServiceUtil.fetchCalendarBooking(
 			calendarBookingId);
@@ -667,7 +667,7 @@
 		Assert.assertNotNull(calendarBooking);
 
 		CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance(
-			calendarBooking, 0, false);
+			_user.getUserId(), calendarBooking, 0, false);
 
 		calendarBooking = CalendarBookingLocalServiceUtil.fetchCalendarBooking(
 			calendarBookingId);
