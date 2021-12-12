diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index d917cdb..60c9e14 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -8192,7 +8192,8 @@
                             + " txPackets=" + entry.txPackets);
                 }
 
-                if (entry.rxBytes == 0 || entry.txBytes == 0) {
+                if (entry.rxBytes == 0 && entry.txBytes == 0) {
+                    // Skip the lookup below since there is no work to do.
                     continue;
                 }
 
