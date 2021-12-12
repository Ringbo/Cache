diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/events/HolidayEventsLoader.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/events/HolidayEventsLoader.java
index 57e9ce2..2b6fb87 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/events/HolidayEventsLoader.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/anomaly/events/HolidayEventsLoader.java
@@ -239,7 +239,7 @@
     try {
       newHolidays = getAllHolidays(start, end);
     } catch (Exception e) {
-      LOG.error("Fetch holidays failed. Aborting.");
+      LOG.error("Fetch holidays failed. Aborting.", e);
       return;
     }
     Map<HolidayEvent, Set<String>> newHolidayEventToCountryCodes = aggregateCountryCodesGroupByHolidays(newHolidays);
@@ -356,7 +356,7 @@
       try {
         events.addAll(this.getCalendarEvents(calendar, start, end));
       } catch (GoogleJsonResponseException e) {
-        LOG.warn("Fetch holiday events failed in calendar {}. {}", calendar, e.getDetails());
+        LOG.warn("Fetch holiday events failed in calendar {}.", calendar, e);
       }
     }
     return events;
