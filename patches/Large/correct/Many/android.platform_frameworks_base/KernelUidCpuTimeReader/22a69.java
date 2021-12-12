diff --git a/core/java/com/android/internal/os/KernelUidCpuTimeReader.java b/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
index c828d11..e8919ed 100644
--- a/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
+++ b/core/java/com/android/internal/os/KernelUidCpuTimeReader.java
@@ -120,7 +120,7 @@
                             sb.append(" s=");
                             TimeUtils.formatDuration(systemTimeDeltaUs / 1000, sb);
                             sb.append(" p=").append(powerDeltaMaUs / 1000).append("mAms");
-                            Slog.wtf(TAG, sb.toString());
+                            Slog.e(TAG, sb.toString());
 
                             userTimeDeltaUs = 0;
                             systemTimeDeltaUs = 0;
