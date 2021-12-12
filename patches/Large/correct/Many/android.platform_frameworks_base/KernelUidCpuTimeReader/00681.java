diff --git a/core/java/com/android/internal/os/KernelUidCpuTimeReader.java b/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
index 5d3043c..c828d11 100644
--- a/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
+++ b/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
@@ -84,7 +84,8 @@
                     powerMaUs = 0;
                 }
 
-                if (callback != null) {
+                // Only report if there is a callback and if this is not the first read.
+                if (callback != null && mLastTimeReadUs != 0) {
                     long userTimeDeltaUs = userTimeUs;
                     long systemTimeDeltaUs = systemTimeUs;
                     long powerDeltaMaUs = powerMaUs;
