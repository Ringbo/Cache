diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 17ef77c..31064ac 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -10049,7 +10049,7 @@
         // Read the CPU data for each UID. This will internally generate a snapshot so next time
         // we read, we get a delta. If we are to distribute the cpu time, then do so. Otherwise
         // we just ignore the data.
-        final long startTimeMs = mClocks.elapsedRealtime();
+        final long startTimeMs = mClocks.uptimeMillis();
         mKernelUidCpuTimeReader.readDelta(!mOnBatteryInternal ? null :
                 new KernelUidCpuTimeReader.Callback() {
                     @Override
@@ -10121,7 +10121,7 @@
             readKernelUidCpuFreqTimesLocked();
         }
 
-        final long elapse = (mClocks.elapsedRealtime() - startTimeMs);
+        final long elapse = (mClocks.uptimeMillis() - startTimeMs);
         if (DEBUG_ENERGY_CPU || (elapse >= 100)) {
             Slog.d(TAG, "Reading cpu stats took " + elapse + " ms");
         }
