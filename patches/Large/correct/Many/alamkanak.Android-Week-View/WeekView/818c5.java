diff --git a/library/src/main/java/com/alamkanak/weekview/WeekView.java b/library/src/main/java/com/alamkanak/weekview/WeekView.java
index 593febb..a57ccbe 100644
--- a/library/src/main/java/com/alamkanak/weekview/WeekView.java
+++ b/library/src/main/java/com/alamkanak/weekview/WeekView.java
@@ -887,9 +887,9 @@
             Calendar startTime = (Calendar) event.getEndTime().clone();
             startTime.set(Calendar.HOUR_OF_DAY, 0);
             startTime.set(Calendar.MINUTE, 0);
-            WeekViewEvent event1 = new WeekViewEvent(event.getId(), event.getName(), event.getStartTime(), endTime);
+            WeekViewEvent event1 = new WeekViewEvent(event.getId(), event.getName(), event.getLocation(), event.getStartTime(), endTime);
             event1.setColor(event.getColor());
-            WeekViewEvent event2 = new WeekViewEvent(event.getId(), event.getName(), startTime, event.getEndTime());
+            WeekViewEvent event2 = new WeekViewEvent(event.getId(), event.getName(), event.getLocation(), startTime, event.getEndTime());
             event2.setColor(event.getColor());
             mEventRects.add(new EventRect(event1, event, null));
             mEventRects.add(new EventRect(event2, event, null));
