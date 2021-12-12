diff --git a/services/core/java/com/android/server/am/BatteryStatsService.java b/services/core/java/com/android/server/am/BatteryStatsService.java
index 938d2cf..e5b2eca 100644
--- a/services/core/java/com/android/server/am/BatteryStatsService.java
+++ b/services/core/java/com/android/server/am/BatteryStatsService.java
@@ -1189,7 +1189,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
 
         int flags = 0;
         boolean useCheckinFormat = false;
