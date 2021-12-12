diff --git a/JodaTime/src/test/org/joda/time/TestDateTimeZone.java b/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
index 2b51bad..b6976bc 100644
--- a/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
+++ b/JodaTime/src/test/org/joda/time/TestDateTimeZone.java
@@ -696,7 +696,7 @@
         assertEquals(false, zone5.equals(zone1));
         assertEquals(false, zone5.equals(zone2));
         assertEquals(false, zone5.equals(zone3));
-        assertEquals(false, zone5.equals(zone5));
+        assertEquals(false, zone5.equals(zone4));
         assertEquals(false, zone1.hashCode() == zone5.hashCode());
         assertEquals(true, zone5.hashCode() == zone5.hashCode());
     }
