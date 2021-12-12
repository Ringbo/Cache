diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index c0bf825..8aaa7bc 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -9594,7 +9594,7 @@
                 }
                 doWrite = true;
                 resetAllStatsLocked();
-                if (chargeUAh > 0) {
+                if (chargeUAh > 0 && level > 0) {
                     // Only use the reported coulomb charge value if it is supported and reported.
                     mEstimatedBatteryCapacity = (int) ((chargeUAh / 1000) / (level / 100.0));
                 }
