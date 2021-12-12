diff --git a/core/java/android/pim/RecurrenceSet.java b/core/java/android/pim/RecurrenceSet.java
index 635323e..282417d 100644
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
                 
@@ -204,9 +206,6 @@
         }
         
         if (allDay) {
-        	// TODO: also change tzid to be UTC?  that would be consistent, but
-        	// that would not reflect the original timezone value back to the
-        	// server.
         	start.timezone = Time.TIMEZONE_UTC;
         }
         long millis = start.toMillis(false /* use isDst */);
