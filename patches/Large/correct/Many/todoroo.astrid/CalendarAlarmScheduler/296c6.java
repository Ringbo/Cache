diff --git a/astrid/plugin-src/com/todoroo/astrid/gcal/CalendarAlarmScheduler.java b/astrid/plugin-src/com/todoroo/astrid/gcal/CalendarAlarmScheduler.java
index 55f7029..fd3f8c1 100644
--- a/astrid/plugin-src/com/todoroo/astrid/gcal/CalendarAlarmScheduler.java
+++ b/astrid/plugin-src/com/todoroo/astrid/gcal/CalendarAlarmScheduler.java
@@ -36,7 +36,7 @@
         Cursor events = cr.query(Calendars.getCalendarContentUri(Calendars.CALENDAR_CONTENT_EVENTS),
                 new String[] { Calendars.ID_COLUMN_NAME, Calendars.EVENTS_DTSTART_COL },
                 Calendars.EVENTS_DTSTART_COL + " > ? AND " + Calendars.EVENTS_DTSTART_COL + " < ?",
-                new String[] { Long.toString(now + DateUtilities.ONE_MINUTE * 20), Long.toString(now + DateUtilities.ONE_DAY) },
+                new String[] { Long.toString(now + DateUtilities.ONE_MINUTE * 15), Long.toString(now + DateUtilities.ONE_DAY) },
                 null);
         try {
             if (events.getCount() > 0) {
