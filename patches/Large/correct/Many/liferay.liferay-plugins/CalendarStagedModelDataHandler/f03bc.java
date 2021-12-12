diff --git a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/lar/CalendarStagedModelDataHandler.java b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/lar/CalendarStagedModelDataHandler.java
index 0d56458..bb86b76 100644
--- a/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/lar/CalendarStagedModelDataHandler.java
+++ b/portlets/calendar-portlet/docroot/WEB-INF/src/com/liferay/calendar/lar/CalendarStagedModelDataHandler.java
@@ -142,25 +142,28 @@
 				importedCalendar = CalendarLocalServiceUtil.addCalendar(
 					userId, portletDataContext.getScopeGroupId(),
 					calendarResourceId, calendarNameMap,
-					calendar.getDescriptionMap(), calendar.getColor(),
-					calendar.isDefaultCalendar(), calendar.isEnableComments(),
-					calendar.isEnableRatings(), serviceContext);
+					calendar.getDescriptionMap(), calendar.getTimeZoneId(),
+					calendar.getColor(), calendar.isDefaultCalendar(),
+					calendar.isEnableComments(), calendar.isEnableRatings(),
+					serviceContext);
 			}
 			else {
 				importedCalendar = CalendarLocalServiceUtil.updateCalendar(
 					existingCalendar.getCalendarId(), calendar.getNameMap(),
-					calendar.getDescriptionMap(), calendar.getColor(),
-					calendar.isDefaultCalendar(), calendar.isEnableComments(),
-					calendar.isEnableRatings(), serviceContext);
+					calendar.getDescriptionMap(), calendar.getTimeZoneId(),
+					calendar.getColor(), calendar.isDefaultCalendar(),
+					calendar.isEnableComments(), calendar.isEnableRatings(),
+					serviceContext);
 			}
 		}
 		else {
 			importedCalendar = CalendarLocalServiceUtil.addCalendar(
 				userId, portletDataContext.getScopeGroupId(),
 				calendarResourceId, calendarNameMap,
-				calendar.getDescriptionMap(), calendar.getColor(),
-				calendar.isDefaultCalendar(), calendar.isEnableComments(),
-				calendar.isEnableRatings(), serviceContext);
+				calendar.getDescriptionMap(), calendar.getTimeZoneId(),
+				calendar.getColor(), calendar.isDefaultCalendar(),
+				calendar.isEnableComments(), calendar.isEnableRatings(),
+				serviceContext);
 		}
 
 		portletDataContext.importClassedModel(calendar, importedCalendar);
