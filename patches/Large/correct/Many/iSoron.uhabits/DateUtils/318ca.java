diff --git a/uhabits-core/src/main/java/org/isoron/uhabits/core/utils/DateUtils.java b/uhabits-core/src/main/java/org/isoron/uhabits/core/utils/DateUtils.java
index 59ae5c6..2771f35 100644
--- a/uhabits-core/src/main/java/org/isoron/uhabits/core/utils/DateUtils.java
+++ b/uhabits-core/src/main/java/org/isoron/uhabits/core/utils/DateUtils.java
@@ -69,7 +69,7 @@
     private static GregorianCalendar getCalendar(long timestamp)
     {
         GregorianCalendar day =
-            new GregorianCalendar(TimeZone.getTimeZone("GMT"));
+            new GregorianCalendar(TimeZone.getTimeZone("GMT"), getLocale());
         day.setTimeInMillis(timestamp);
         return day;
     }
