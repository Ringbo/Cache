diff --git a/services/core/java/com/android/server/am/ProcessStatsService.java b/services/core/java/com/android/server/am/ProcessStatsService.java
index b6ae33d..deb3b28 100644
--- a/services/core/java/com/android/server/am/ProcessStatsService.java
+++ b/services/core/java/com/android/server/am/ProcessStatsService.java
@@ -616,7 +616,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!com.android.internal.util.DumpUtils.checkDumpPermission(mAm.mContext,
+        if (!com.android.internal.util.DumpUtils.checkDumpAndUsageStatsPermission(mAm.mContext,
                 TAG, pw)) return;
 
         long ident = Binder.clearCallingIdentity();
