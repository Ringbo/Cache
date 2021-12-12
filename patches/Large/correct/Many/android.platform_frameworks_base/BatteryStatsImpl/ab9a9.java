diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 648b1a5..3ea1397 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -8056,7 +8056,8 @@
                             + " txPackets=" + entry.txPackets);
                 }
 
-                if (entry.rxBytes == 0 || entry.txBytes == 0) {
+                if (entry.rxBytes == 0 && entry.txBytes == 0) {
+                    // Skip the lookup below since there is no work to do.
                     continue;
                 }
 
