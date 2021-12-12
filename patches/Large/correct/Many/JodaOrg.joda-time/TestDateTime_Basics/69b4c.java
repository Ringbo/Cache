diff --git a/JodaTime/src/test/org/joda/time/TestDateTime_Basics.java b/JodaTime/src/test/org/joda/time/TestDateTime_Basics.java
index bfa1cb2..384e876 100644
--- a/JodaTime/src/test/org/joda/time/TestDateTime_Basics.java
+++ b/JodaTime/src/test/org/joda/time/TestDateTime_Basics.java
@@ -505,7 +505,7 @@
         assertSame(DateTime.class, result.getClass());
         assertSame(ISOChronology.class, result.getChronology().getClass());
         assertEquals(test.getMillis(), result.getMillis());
-        assertEquals(ISOChronology.getInstance(), result.getChronology());
+        assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
         assertNotSame(test, result);
         
         test = new DateTime(TEST_TIME1, BuddhistChronology.getInstance());
