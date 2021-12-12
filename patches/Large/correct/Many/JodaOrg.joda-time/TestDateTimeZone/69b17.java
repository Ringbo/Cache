diff --git a/JodaTime/src/test/org/joda/time/TestDateTimeZone.java b/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
index ad674e7..724bb55 100644
--- a/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
+++ b/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
@@ -843,7 +843,7 @@
         // the tz database does not have unique name keys [1716305]
         DateTimeZone zone = DateTimeZone.forID("Europe/London");
         
-        DateTime now = new DateTime();
+        DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
         String str1 = zone.getName(now.getMillis());
         String str2 = zone.getName(now.plusMonths(6).getMillis());
         assertEquals(false, str1.equals(str2));
@@ -853,7 +853,7 @@
         // the tz database does not have unique name keys [1716305]
         DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");
         
-        DateTime now = new DateTime();
+        DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
         String str1 = zone.getName(now.getMillis());
         String str2 = zone.getName(now.plusMonths(6).getMillis());
         assertEquals(false, str1.equals(str2));
