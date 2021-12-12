diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index c34c379..f3f34a8 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -9711,7 +9711,7 @@
                 }
                 doWrite = true;
                 resetAllStatsLocked();
-                if (chargeUAh > 0) {
+                if (chargeUAh > 0 && level > 0) {
                     // Only use the reported coulomb charge value if it is supported and reported.
                     mEstimatedBatteryCapacity = (int) ((chargeUAh / 1000) / (level / 100.0));
                 }
