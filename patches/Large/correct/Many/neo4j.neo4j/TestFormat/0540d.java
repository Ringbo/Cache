diff --git a/community/kernel/src/test/java/org/neo4j/helpers/TestFormat.java b/community/kernel/src/test/java/org/neo4j/helpers/TestFormat.java
index 3a9e9c8..7f6bc3e 100644
--- a/community/kernel/src/test/java/org/neo4j/helpers/TestFormat.java
+++ b/community/kernel/src/test/java/org/neo4j/helpers/TestFormat.java
@@ -76,7 +76,7 @@
 
     private long translateToDate( long timeWithDate, long time, TimeZone timeIsGivenInThisTimeZone )
     {
-        Calendar calendar = Calendar.getInstance();
+        Calendar calendar = Calendar.getInstance(timeIsGivenInThisTimeZone);
         calendar.setTimeInMillis( timeWithDate );
         
         Calendar timeCalendar = Calendar.getInstance();
