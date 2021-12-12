diff --git a/hadoop-hdds/client/src/main/java/org/apache/hadoop/hdds/scm/client/HddsClientUtils.java b/hadoop-hdds/client/src/main/java/org/apache/hadoop/hdds/scm/client/HddsClientUtils.java
index a6813eb..9c59038 100644
--- a/hadoop-hdds/client/src/main/java/org/apache/hadoop/hdds/scm/client/HddsClientUtils.java
+++ b/hadoop-hdds/client/src/main/java/org/apache/hadoop/hdds/scm/client/HddsClientUtils.java
@@ -74,7 +74,7 @@
    */
   public static String formatDateTime(long millis) {
     ZonedDateTime dateTime = ZonedDateTime.ofInstant(
-        Instant.ofEpochSecond(millis), DATE_FORMAT.get().getZone());
+        Instant.ofEpochMilli(millis), DATE_FORMAT.get().getZone());
     return DATE_FORMAT.get().format(dateTime);
   }
 
@@ -85,7 +85,7 @@
   public static long formatDateTime(String date) throws ParseException {
     Preconditions.checkNotNull(date, "Date string should not be null.");
     return ZonedDateTime.parse(date, DATE_FORMAT.get())
-        .toInstant().getEpochSecond();
+        .toInstant().toEpochMilli();
   }
 
 
