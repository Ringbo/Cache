diff --git a/core/java/com/android/internal/os/KernelUidCpuFreqTimeReader.java b/core/java/com/android/internal/os/KernelUidCpuFreqTimeReader.java
index c89f546..e85e295 100644
--- a/core/java/com/android/internal/os/KernelUidCpuFreqTimeReader.java
+++ b/core/java/com/android/internal/os/KernelUidCpuFreqTimeReader.java
@@ -137,7 +137,7 @@
                 sb.append("times=").append("(");
                 TimeUtils.formatDuration(mLastTimeReadMs, sb); sb.append(",");
                 TimeUtils.formatDuration(mNowTimeMs, sb); sb.append(")");
-                Slog.wtf(TAG, sb.toString());
+                Slog.e(TAG, sb.toString());
                 return;
             }
             curUidTimeMs[i] = totalTimeMs;
