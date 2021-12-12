diff --git a/core/java/android/pim/RecurrenceSet.java b/core/java/android/pim/RecurrenceSet.java
index 635323e..f5e1bac 100644
--- a/core/java/android/pim/RecurrenceSet.java
+++ b/core/java/android/pim/RecurrenceSet.java
@@ -181,7 +181,9 @@
         boolean inUtc = start.parse(dtstart);
         boolean allDay = start.allDay;
 
-        if (inUtc) {
+        // We force TimeZone to UTC for "all day recurring events" as the server is sending no
+        // TimeZone in DTSTART for them
+        if (inUtc || allDay) {
             tzid = Time.TIMEZONE_UTC;
         }
                 
