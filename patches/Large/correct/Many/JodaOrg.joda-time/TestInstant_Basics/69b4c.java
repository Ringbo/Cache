diff --git a/JodaTime/src/test/org/joda/time/TestInstant_Basics.java b/JodaTime/src/test/org/joda/time/TestInstant_Basics.java
index 7799917..d9baccd 100644
--- a/JodaTime/src/test/org/joda/time/TestInstant_Basics.java
+++ b/JodaTime/src/test/org/joda/time/TestInstant_Basics.java
@@ -403,7 +403,7 @@
         assertSame(DateTime.class, result.getClass());
         assertSame(ISOChronology.class, result.getChronology().getClass());
         assertEquals(test.getMillis(), result.getMillis());
-        assertEquals(ISOChronology.getInstance(), result.getChronology());
+        assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
     }
 
     public void testToDateTime_DateTimeZone() {
@@ -443,7 +443,7 @@
         Instant test = new Instant(TEST_TIME1);
         MutableDateTime result = test.toMutableDateTime();
         assertEquals(test.getMillis(), result.getMillis());
-        assertEquals(ISOChronology.getInstance(), result.getChronology());
+        assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
     }
 
     public void testToMutableDateTimeISO() {
@@ -452,7 +452,7 @@
         assertSame(MutableDateTime.class, result.getClass());
         assertSame(ISOChronology.class, result.getChronology().getClass());
         assertEquals(test.getMillis(), result.getMillis());
-        assertEquals(ISOChronology.getInstance(), result.getChronology());
+        assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
     }
 
     public void testToMutableDateTime_DateTimeZone() {
