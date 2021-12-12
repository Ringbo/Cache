diff --git a/core/java/android/hardware/SystemSensorManager.java b/core/java/android/hardware/SystemSensorManager.java
index 0204e94..7375e7d 100644
--- a/core/java/android/hardware/SystemSensorManager.java
+++ b/core/java/android/hardware/SystemSensorManager.java
@@ -373,7 +373,8 @@
                         for (Sensor s : l.getSensors()) {
                             disableSensorLocked(s);
                         }
-                    } else if (l.removeSensor(sensor) == 0) {
+                    // Check if the ListenerDelegate has the sensor it is trying to unregister.
+                    } else if (l.hasSensor(sensor) && l.removeSensor(sensor) == 0) {
                         // if we have no more sensors enabled on this listener,
                         // take it off the list.
                         sListeners.remove(i);
