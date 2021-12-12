diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index b4fc24a..f28315b 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -9612,7 +9612,7 @@
                 }
                 doWrite = true;
                 resetAllStatsLocked();
-                if (chargeUAh > 0) {
+                if (chargeUAh > 0 && level > 0) {
                     // Only use the reported coulomb charge value if it is supported and reported.
                     mEstimatedBatteryCapacity = (int) ((chargeUAh / 1000) / (level / 100.0));
                 }
