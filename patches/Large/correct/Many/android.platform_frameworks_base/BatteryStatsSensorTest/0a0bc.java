diff --git a/core/tests/coretests/src/com/android/internal/os/BatteryStatsSensorTest.java b/core/tests/coretests/src/com/android/internal/os/BatteryStatsSensorTest.java
index 8fd4e31..0294095 100644
--- a/core/tests/coretests/src/com/android/internal/os/BatteryStatsSensorTest.java
+++ b/core/tests/coretests/src/com/android/internal/os/BatteryStatsSensorTest.java
@@ -488,7 +488,7 @@
         bi.noteStartSensorLocked(UID, SENSOR_ID);
 
         clocks.realtime += 111;
-        clocks.uptime += 1111;
+        clocks.uptime += 111;
 
         // Timebase and timer was on so times have increased.
         assertEquals(111_000, timer.getTotalTimeLocked(1000*clocks.realtime, which));
