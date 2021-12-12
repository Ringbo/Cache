diff --git a/core/src/main/java/com/graphhopper/reader/osm/conditional/DateRange.java b/core/src/main/java/com/graphhopper/reader/osm/conditional/DateRange.java
index 4646aac..028462b 100644
--- a/core/src/main/java/com/graphhopper/reader/osm/conditional/DateRange.java
+++ b/core/src/main/java/com/graphhopper/reader/osm/conditional/DateRange.java
@@ -27,7 +27,7 @@
         Calendar toCal = to.parsedCalendar;
 
         // This should never happen
-        if (fromCal.get(Calendar.ERA) != fromCal.get(Calendar.ERA))
+        if (fromCal.get(Calendar.ERA) != toCal.get(Calendar.ERA))
         {
             throw new IllegalArgumentException("Different ERAs are not allowed. From:" + from + " To:" + to);
         }
