diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 35c66ba..7a8a3be 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -867,15 +867,15 @@
 
                 String[] nameStringArray = mProcWakelocksName;
                 long[] wlData = mProcWakelocksData;
-                Process.parseProcLine(wlBuffer, startIndex, endIndex, PROC_WAKELOCKS_FORMAT, 
-                        nameStringArray, wlData, null);
+                boolean parsed = Process.parseProcLine(wlBuffer, startIndex, endIndex,
+                        PROC_WAKELOCKS_FORMAT, nameStringArray, wlData, null);
                 
                 name = nameStringArray[0];
                 count = (int) wlData[1];
                 // convert nanoseconds to microseconds with rounding.
                 totalTime = (wlData[2] + 500) / 1000;
 
-                if (name.length() > 0) {
+                if (parsed && name.length() > 0) {
                     if (!m.containsKey(name)) {
                         m.put(name, new KernelWakelockStats(count, totalTime, 
                                 sKernelWakelockUpdateVersion));
